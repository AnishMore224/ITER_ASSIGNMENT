num = int (input("Enter a number: "))
count,temp=0,num
while temp>0:
    count+=1
    temp//=10
count-=1
while  num>0:
    digit= num//(10**count)
    if digit==0:
        print("ZERO",end=' ')
    elif digit==1:
        print("ONE",end=' ')
    elif digit==2:
        print("TWO",end=' ')
    elif digit==3:
        print("THREE",end=' ')
    elif digit==4:
        print("FOUR",end=' ')
    elif digit==5:
        print("FIVE",end=' ')
    elif digit==6:
        print("SIX",end=' ')
    elif digit==7:
        print("SEVEN",end=' ')
    elif  digit==8:
        print("EIGHT",end=' ')
    elif  digit==9:
        print("NINE",end=' ')
    num=num%(10**count)
    count-=1
print()

'''
Output--
Enter a number: 12234
ONE TWO TWO THREE FOUR
'''