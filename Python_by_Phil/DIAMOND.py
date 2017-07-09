number=eval(input("How wide do you want your diamond?"))
g=number

for x in range (0,number+1):
    
    for y in range (0, g):
        print(" ",end="")
    
    for d in range (0,x):
        print ("* ",end="")
    
    g-=1
    print ("")

q=number

for w in range (0,number):
    
    for k in range (0, w+1):
        print(" ",end="")
    
    for o in range (1,q):
        print ("* ",end="")
     
    q-=1
    print("")


    
        
