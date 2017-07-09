from random import randint
number=randint (1,10)


guessing= True
while (guessing==True):


    print ("Welcome to 'GUESS THAT NUMBER'!") 
    guess=eval(input ("I'm thinking of a number from one to ten"))
    print (guess)
 

    if (guess==number): 
        print ("GREAT JOB! AMAZING! YOU WIN A MILLION DOLLARS! WOO HOO!")
        guessing= False
    elif (guess==6): 
        print ("SO CLOSE! Eh, you still win nothing")
    elif (guess==8):
        print ("SO CLOSE! Eh, you still win nothing")
    else:
        print ("you lose, you win nothing. Sorry, try again!")
    if (guess <7):
        print ("Guess higher!")
    if (guess >7):
        print ("Guess lower!")
    if (guess <1):
        print ("HEY! I SAID 1 TO 10 BUDDY!")
    if (guess >10):
        print ("HEY! I SAID 1 TO 10 BUDDY!")