class bankaccount():
    def __init__(self,account_number,account_name,account_type,balance):
        self.account_name=aname
        self.account_number=anum
        self.account_type=atype
        self.balance=bal
    def deposit(self,money):
        self.balance+=money
        print("Amount deposited =",money)
        print("Current balance = ",self.balance)
    def accountinfo(self):
        print("Account name =",self.account_name)
        print("Account number =",self.account_number)
        print("Account type =",self.account_type)
        print("Account balance =",self.balance)
    def withdraw(self,money):
        if money>self.balance:
            print("Insufficiant balance")
        else:
            self.balance-=money
            print("withdraw amount",amount)
            print("Balance amount",self.balance)
anum=int(input("Enter Account Number:"))
aname=input("Enter Account Holder Name:")
atype=input("Enter Account Type:")
bal=float(input("Enter the balance:"))
obj=bankaccount(anum,aname,atype,bal)
option=int(input("Enter your choice....\n 1:Accountinfo\n 2:Deposit\n 3:Withdraw\n"))
if option==1:
    print("Account information is")
    obj.accountinfo()
elif option==2:
    amount=int(input("Enter amount to deposit:"))
    obj.deposit(amount)
elif option==3:
    amount=int(input("Enter amount to withdraw:"))
    obj.withdraw(amount)
else:
    print("Invalid option...!!")

