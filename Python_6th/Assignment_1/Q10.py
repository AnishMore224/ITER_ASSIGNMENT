class CommissionEmployee:
    def __init__(self, first_name, last_name, sales, commission_rate):
        self.first_name = first_name
        self.last_name = last_name
        self.sales = sales
        self.commission_rate = commission_rate

    @property
    def first_name(self):
        return self._first_name

    @first_name.setter
    def first_name(self, value):
        if not value:
            raise ValueError("First name cannot be empty")
        self._first_name = value

    @property
    def last_name(self):
        return self._last_name

    @last_name.setter
    def last_name(self, value):
        if not value:
            raise ValueError("Last name cannot be empty")
        self._last_name = value

    @property
    def sales(self):
        return self._sales

    @sales.setter
    def sales(self, value):
        if value < 0:
            raise ValueError("Sales cannot be negative")
        self._sales = value

    @property
    def commission_rate(self):
        return self._commission_rate

    @commission_rate.setter
    def commission_rate(self, value):
        if value < 0 or value > 1:
            raise ValueError("Commission rate must be between 0 and 1")
        self._commission_rate = value

    def earnings(self):
        return self.sales * self.commission_rate

    def __repr__(self):
        return (f"CommissionEmployee(first_name='{self.first_name}', "
                f"last_name='{self.last_name}', sales={self.sales}, "
                f"commission_rate={self.commission_rate})")

try:
    employee = CommissionEmployee("Anish", "More", 10000, 0.1)
    print(employee)
    print(f"Earnings: {employee.earnings()}")

    employee.sales = 15000
    print(f"Updated Earnings: {employee.earnings()}")

    employee.sales = -5000 
except ValueError as e:
    print(e)
    
'''
Output---
CommissionEmployee(first_name='Anish', last_name='More', sales=10000, commission_rate=0.1)
Earnings: 1000.0
Updated Earnings: 1500.0
Sales cannot be negative
'''