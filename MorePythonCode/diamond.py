print ("Welcome to STAR PRINTER!")
numb=eval (input ("How many stars would you like for your base?"))


g=numb

for x in range (0, numb+1):
        
    for p in range(0, g):
        print (" ",end="")
    
    for w in range (0, x):
        print ("* ",end="")
            
    g-=1
    print ("")

l= numb
for q in range (0, numb+1):
        
    for d in range(0, q):
        print (" ",end="")
    
    for c in range (0, l):
        print ("* ",end="")
        
    l-=1
    print ("")