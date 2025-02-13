class InsufficientFundsException(Exception):
    def __init__(self, balance, withdrawal_amount):
        self.balance = balance
        self.withdrawal_amount = withdrawal_amount
        super().__init__(f"Insufficient funds: Balance is {self.balance}, but withdrawal amount is {self.withdrawal_amount}")

def withdraw(balance, amount):
    if amount > balance:
        raise InsufficientFundsException(balance, amount)
    balance -= amount
    return balance

try:
    current_balance = 100
    withdrawal_amount = 150
    new_balance = withdraw(current_balance, withdrawal_amount)
    print(f"New balance: {new_balance}")
except InsufficientFundsException as e:
    print(e)

'''
Output---
Insufficient funds: Balance is 100, but withdrawal amount is 150
'''