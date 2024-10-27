def basic_salary(hourly_rate, hours_worked_per_week):
    if hours_worked_per_week > 40:
        basic_salary = hourly_rate * 40
    else:
        basic_salary = hourly_rate * hours_worked_per_week
    return basic_salary

def overtime_salary(hourly_rate, hours_worked_per_week):
    if hours_worked_per_week > 40:
        overtime = (hours_worked_per_week - 40) * 1.5 * hourly_rate
        return overtime
    else:
        return 0
def total_salary(hourly_rate, hours_worked_per_week):
    return basic_salary(hourly_rate, hours_worked_per_week) + overtime_salary(hourly_rate, hours_worked_per_week)
