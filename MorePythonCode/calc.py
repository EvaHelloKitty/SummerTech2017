calc=True
while (calc==True):

    print ("Welcome to ULTIMATE CALCULATOR!")
    numb1=eval (input ("Pick your first number"))
    numb2=eval (input ("Pick your second number"))
    opperation= input ("What would you like to do?")
    if (opperation=="multiply" or opperation== "*" or opperation== "times"):
        print (numb1 * numb2)
    if (opperation=="divide" or opperation== "/"):
        if (numb2== 0 ):
            print ("You can't divide by zero")
    else: (numb1 / numb2)
    if (opperation=="add" or opperation== "+" or opperation== "plus"):
        print (numb1 + numb2)
    if (opperation=="subtract" or opperation== "-" or opperation== "minus"):
        print (numb1 - numb2)   
        print ("CONGRATS!")
  
    question=input ("Do you want to quit?")
    print (question)
    if (question=="yes"):
        calc=False