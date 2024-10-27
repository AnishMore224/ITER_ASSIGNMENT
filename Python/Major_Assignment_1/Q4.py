def salary_bracket(gross):
    if gross < 50000:
        return "Low income"
    elif gross >= 50000 and gross <= 80000:
        return "Middle income"
    else:
        return "High income"