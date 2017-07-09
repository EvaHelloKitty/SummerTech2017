from random import randint



game=True
while (game==True):
    result=randint(0,2)
    if (result==0):
        computer="rock"
    if (result==1):
        computer="paper"
    if (result==2):
        computer="scissors"
    
    choice=input("Choose rock paper or scissors!")
    if (choice=="paper" and result==0):
        print ("YOU WIN! I lose...")
        print ("I chose " + computer)
    if (choice=="scissors" and result==0):
        print("You lost! I win!")
        print ("I chose " + computer)
    if (choice=="rock" and result==0):
        print ("DRAW!!")
        print ("I chose " + computer)
    if (choice=="paper" and result==1):
        print("DRAW!!")
        print ("I chose " + computer)
    if (choice=="rock" and result==1):
        print ("You lost! I WIN!")
        print ("I chose " + computer)
    if (choice=="scissors" and result==1):
        print ("YOU WIN! I lose...")
        print ("I chose " + computer)
    if (choice=="rock" and result==2):
        print ("YOU WIN! I lose...")
        print ("I chose " + computer)
    if (choice=="paper" and result==2):
        print ("You lose! I WIN!")
        print ("I chose " + computer)
    if (choice=="scissors" and result==2):
        print ("DRAW!!")
        print ("I chose " + computer)
    
    answer=(input("Would you like to play again?"))
    if (answer=="no"):
        game=False
    