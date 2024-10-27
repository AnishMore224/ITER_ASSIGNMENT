from Q2 import tax_amount

def gross_salary(basic):
    return basic + (basic * 0.20) - tax_amount(basic)
