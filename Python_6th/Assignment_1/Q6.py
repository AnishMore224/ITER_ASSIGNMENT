class BankAccount:
    def __init__(self, initial_balance=0):
        self.__balance = initial_balance

    def deposit(self, amount):
        if amount > 0:
            self.__balance += amount
            print(f"Deposited: {amount}")
        else:
            print("Deposit amount must be positive.")

    def withdraw(self, amount):
        if 0 < amount <= self.__balance:
            self.__balance -= amount
            print(f"Withdrawn: {amount}")
        else:
            print("Invalid withdrawal amount.")

    def display_balance(self):
        print(f"Current balance: {self.__balance}")


account = BankAccount(100)
account.deposit(50)
account.withdraw(30)
account.display_balance()

'''
Output---
Deposited: 50
Withdrawn: 30
Current balance: 120
'''