def tax_amount(salary):
    if salary < 60000:
        return salary * 0.10
    elif salary >= 60000 and salary <= 85000:
        return salary * 0.15
    else:
        return salary * 0.20
