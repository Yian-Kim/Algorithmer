def search(seq, num):
	start = 0
	end = len(seq)-1
	
	while start<=end:
		mid = (start+end)//2
		if seq[mid] == num:
			return 1
		elif seq[mid] > num:
			end = mid-1
		else:
			start = mid+1
	return 0
	

def solution(N, seq, M, user):
	seq.sort()
	res = []
	for u in user:
		res.append(search(seq, u))
	return res

N = int(input())
seq = list(map(int, input().split()))
M = int(input())
user = list(map(int, input().split()))
	
print(*solution(N, seq, M, user), sep="\n")










"""
N = int(input())
sequence_list = map(int, input().split())
M = int(input())
find_list = map(int, input().split())
result = []
for number in sequence_list:
	for comparison in find_list:
	
		if comparison == number:
			result.append("0")
		else:
			result.append("1")

for i in find_list: 
	print(i, end="\n")
"""