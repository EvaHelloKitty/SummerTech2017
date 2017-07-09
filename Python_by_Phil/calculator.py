answer=True
while (answer==True):
    number1= eval(input("Pick a number, any number!"))
    number2= eval(input("Now pick ANOTHER number"))
    if (number2==0):
        print ("Remember, you can't divide by zero!")
    opperation1= input("Now! For the secret ingredient...pick an opperation! If one of your numbers was 0 please don't divide! It's impossible!")
    if (opperation1=="+" or opperation1=="addition" or opperation1=="plus" or opperation1=="add"):
        print (number1 + number2)
    elif (opperation1=="-" or opperation1=="subraction" or opperation1=="subract" or opperation1=="minus"):
        print (number1-number2)
    elif (opperation1== "/" or opperation1=="division" or opperation1=="divide"):
        print (number1/number2)
        if (number2==0):
            print ("HEY! I said don't divide by zero!")
    elif (opperation1=="*" or opperation1=="multiplication" or opperation1=="multiply"):
        print (number1*number2)
            
    question= input("Would you like to exit?")
    print (question)
    if (question=="yes"):
        answer=False
            
        