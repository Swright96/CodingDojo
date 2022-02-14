class User :
    bank_name = "First National Dojo"
    account_balance = 0
    
    def __init__(self, name, email_address):
        self.name = name
        self.email = email_address
    
guido = User("Guido Montoya III", "gmontoya@gmail.com")
monty = User("Monty Python", "montythepython@gmail.com")
james = User("James Charles", "jhcharles@gmail.com")
    

def __init__(self):
    self.name = ""
    self.email = ""
    self.account_balance = 0

def __init__(other_user):
    other_user.name = ""
    other_user.email = ""
    other_user.account_balance = ""

def make_deposit(self, amount):
    self.account_balance += amount
    print(f"Deposit of ${amount} to {self.name} successful!")

def make_widthdrawl(self, amount):
    self.account_balance -= amount
    if self.account_balance < amount:
        print(f"Sorry {self.name}, you have a lack of funds available. Current balance: ${self.account_balance}")
    else:
        print(f"Widthdrawl of ${amount} from {self.name} successful!")

def display_user_balance(self):
    print(f"User: {self.name}, Balance: $ {self.account_balance}")

def transfer_money(self, other_user, amount):
    self.account_balance -+ amount
    other_user.account_balance += amount
    print(f"{self.name} transfered ${amount} to {other_user.name}")


make_deposit(monty, 100)
make_deposit(monty, 273)
make_deposit(monty, 543)
make_widthdrawl(monty, 264)
display_user_balance(monty)

make_deposit(guido, 6000)
make_deposit(guido, 2500)
make_widthdrawl(guido, 4000)
make_widthdrawl(guido, 2000)
display_user_balance(guido)

make_deposit(james, 25)
make_widthdrawl(james, 7)
make_widthdrawl(james, 5)
make_widthdrawl(james, 9)

transfer_money(guido, james, 1000)
display_user_balance(james)