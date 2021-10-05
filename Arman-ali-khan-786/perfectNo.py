n=int(input("enter a no:"))
s=0
i=1
while i<n:
    if n%i==0:
        s=s+i
    i=i+1
if n==s:
    print(n,"is a perfect no")
else:
    print(n,"is not a perfect no")
