class BankAccount:
    accounts = []
    
    # don't forget to add some default values for these parameters!
    def __init__(self, int_rate, balance): 
        self.int_rate = int_rate
        self.balance = balance
        BankAccount.accounts.append(self)
        # your code here! (remember, instance attributes go here)
        # don't worry about user info here; we'll involve the User class soon
    def deposit(self, amount):
        self.balance += amount
        return self
    def withdraw(self, amount):
        self.balance -= amount
        if self.balance < amount:
            print(f"Insufficient Funds. Balance: {self.balance}")
        return self
    def display_account_info(self):
        self.balance
        print(f"Balance: ${self.balance}")
        return self
    def yield_interest(self):
        if self.balance > 0:
            self.balance += (self.balance * self.int_rate) 
        return self
    @classmethod
    def print_all_account(cls):
        for account in cls.accounts:
            account.display_account_info()

account_one = BankAccount(0.01, 150)
account_two = BankAccount(0.01, 100)

account_one.deposit(100).deposit(200).deposit(45000).withdraw(2500).yield_interest().display_account_info()
account_two.deposit(25000).deposit(6045).withdraw(4000).withdraw(150).withdraw(2000).withdraw(20).yield_interest().display_account_info()

BankAccount.print_all_account()