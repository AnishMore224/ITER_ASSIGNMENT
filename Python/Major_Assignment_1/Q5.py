from Q1 import basic_salary
from Q2 import tax_amount
from Q3 import gross_salary
from Q4 import salary_bracket

employees = []
for i in range(3):
    name = input("Enter employee name: ")
    hourly_rate = float(input("Enter hourly rate: "))
    hours_worked_per_week = float(input("Enter hours worked per week: "))
    employees.append({"name": name, "hourly_rate": hourly_rate, "hours_worked_per_week": hours_worked_per_week})

print("Employee Report")
print("%12s\t%12s\t%12s\t%12s\t%12s" % ("Name", "Basic", "Gross", "Tax", "Bracket"))
for employee in employees:
    basic = basic_salary(employee["hourly_rate"], employee["hours_worked_per_week"])
    gross = gross_salary(basic)
    tax = tax_amount(basic)
    bracket = salary_bracket(gross)
    print("%12s\t%12.2f\t%12.2f\t%12.2f\t%12s" % (employee["name"], basic, gross, tax, bracket))
    
'''
Output:
Enter employee name: anish
Enter hourly rate: 10000 
Enter hours worked per week: 45
Enter employee name: Jiya
Enter hourly rate: 20000
Enter hours worked per week: 30
Enter employee name: himanshu
Enter hourly rate: 7000
Enter hours worked per week: 20
Employee Report
        Name           Basic           Gross             Tax         Bracket
       anish       400000.00       400000.00        80000.00     High income
        Jiya       600000.00       600000.00       120000.00     High income
    himanshu       140000.00       140000.00        28000.00     High income
'''