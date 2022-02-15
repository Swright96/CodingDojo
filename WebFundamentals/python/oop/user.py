class User :

    def __init__(self, name, email_address):
        self.name = name
        self.email = email_address
        self.account_balance = 0

    def make_deposit(self, amount):
        self.account_balance += amount
        print(f"Deposit of ${amount} to {self.name} successful!")
        return self

    def make_widthdrawl(self, amount):
        self.account_balance -= amount
        
        if self.account_balance < amount:
            print(f"Sorry {self.name}, you have a lack of funds available. Current balance: ${self.account_balance}")
        else:
            print(f"Widthdrawl of ${amount} from {self.name} successful!")
        return self

    def display_user_balance(self):
        print(f"User: {self.name}, Balance: $ {self.account_balance}")
        return self

    def transfer_money(self, user, amount):
        self.account_balance -+ amount
        user.account_balance += amount
        print(f"{self.name} transfered ${amount} to {user.name}")
        return self

guido = User("Guido Montoya III", "guidomontoya@gmail.com")
monty = User("Monty Python", "montythepython@gmail.com")
james = User("James Charles", "jameshcharles@gmail.com")


monty.make_deposit(100).make_deposit(273).make_deposit(543).make_widthdrawl(264).display_user_balance()

guido.make_deposit(6000).make_deposit(2500).make_widthdrawl(4000).make_widthdrawl(250).display_user_balance()

james.make_deposit(250).make_widthdrawl(40).make_widthdrawl(80).make_widthdrawl(75)

guido.transfer_money(james,1000).display_user_balance()