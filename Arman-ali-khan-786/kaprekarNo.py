n=int(input("enter a no:"))
sq=n*n
k=1
m=n
while m>0:
    k=k*10
    m=m//10
a=sq%k
b=sq//k
c=a+b
if c==n:
    print("it is a kaprekar no.")
else:
    print("it is not a kaprekar no.")
