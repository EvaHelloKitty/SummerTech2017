from random import randint

    
    
playing=True
while (playing==True):
    result=randint(0,2)
    if (result==0):
        computer="rock"
    if (result==1):
        computer="scissors"
    if (result==2):
        computer="paper"
    print ("WELCOME TO RPS!")
    player=input ("Choose Rock, Paper, or Scissors")
         
    if (player=="rock" and result==0):
        print ("TIE GAME!")
    elif (player=="rock" and result==1):
        print ("YAY! YOU WIN!")   
    elif (player=="rock" and result==2):
        print ("Aww...you lose!")
    elif (player=="paper" and result==0):
        print ("AWESOME! YOU WIN!")
    elif (player=="paper" and result==1):
        print ("Aww...you lose!")
    elif (player=="paper" and result==2):
        print ("TIE GAME!")
    elif (player=="scissors" and result==0):
        print ("Aww...you lose!")
    elif (player=="scissors" and result==1):
        print ("TIE GAME!")
    elif (player=="scissors" and result==2):
        print ("YOU WIN! OUTSTANDING!")
        
        
    play=input ("Do you want to quit?")
    print (play)
    if (play=="yes"):
        playing=False