from random import randint
number= randint(1,100)
guessing=True

while(guessing==True):
   
          
         
    guess= eval(input("Guess a number from 1 to 100"))
    if (guess==number):
        print ("Great job! YOU WON! Woo hoo!")
        guessing=False
    elif (guess<number):
        print ("You were SO close! Try again, a little higher!")
    elif (guess>number):
        print ("Sorry, you lost, try again, a little lower!")