// 주사위 윷놀이 (https://www.acmicpc.net/problem/17825)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] dice;
    static int[] selections;
    static Node[] markers;
    static Node start;
    static int ans;

    private static void permutation(int depth) {
        if (depth == 10) {
            Arrays.fill(markers, start);

            int score = play();
            ans = score > ans ? score : ans;
            recovery();
            return;
        }

        for (int i = 0 ; i < 4 ; ++i) {
            selections[depth] = i;
            permutation(depth + 1);
        }
    }

    private static void recovery() {
        for (int i = 0; i < 4; i++) {
            markers[i].isEmpty = true;
        }
    }

    private static int play() {
        int score = 0;

        for (int i = 0 ; i < 10 ; ++i) {
            Node cur = markers[selections[i]];
            cur.isEmpty = true;

            for (int j = 0 ; j < dice[i] ; ++j) {
                if (j == 0 && cur.shortcut != null) {
                    cur = cur.shortcut;
                } else {
                    cur = cur.next;
                }
            }

            markers[selections[i]] = cur;
            
            if (!cur.isEmpty && !cur.isEnd) {
                return 0;
            } else {
                cur.isEmpty = false;
                score += cur.value;
            }
        }
        return score;
    }

    private static void init() {
        start = new Node(0);
        Node end = null;
        Node center = new Node(25);

        Node temp = start;
        for (int i = 2 ; i <= 40 ; i += 2) {
            temp = temp.addNext(i);
        }

        end = temp.addNext(0);
        end.next = end;
        end.isEnd = true;

        Node n = Node.getNode(10);
        n = n.shortcut = new Node(13);
        n = n.addNext(16);
        n = n.addNext(19);
        n.next = center;

        n = Node.getNode(20);
        n = n.shortcut = new Node(22);
        n = n.addNext(24);
        n.next = center;

        n = Node.getNode(30);
        n = n.shortcut = new Node(28);
        n = n.addNext(27);
        n = n.addNext(26);
        n.next = center;

        n = center.addNext(30);
        n = n.addNext(35);
        n.next = Node.getNode(40);
    }

    static class Node {
        int value;
        boolean isEmpty, isEnd;
        Node next, shortcut;

        Node(int value){
            this.value = value;
            this.isEmpty = true;
            this.isEnd = false;
            this.next = null;
            this.shortcut = null;
        }

        Node addNext(int value) {
            Node nextNode = new Node(value);
            this.next = nextNode;
            return nextNode;
        }

        static Node getNode(int target) {
            Node temp = start;

            while(true) {
                if(temp == null) return null;
                if(temp.value == target) return temp;
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        selections = new int[10];
        dice = new int[10];
        markers = new Node[4];
        ans = Integer.MIN_VALUE;

        for (int i = 0 ; i < 10 ; ++i) {
            dice[i] = Integer.parseInt(st.nextToken());
        }

        init();
        permutation(0);
        System.out.println(ans);
    }
}
