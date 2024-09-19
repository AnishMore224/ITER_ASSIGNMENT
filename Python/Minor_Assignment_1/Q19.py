cost=float(input("Enter cost of meal:"))
tax=cost*0.12
tip=cost*0.18
print("Tax:%.2f\nTop:%.2f\nGrand Total:%.2f"%(tax,tip,tax+tip+cost))

'''
Output---
Enter cost of meal:110
Tax:13.20
Top:19.80
Grand Total:143.00
'''