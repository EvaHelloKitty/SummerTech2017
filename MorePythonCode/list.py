shopping=True

list=[]

while (shopping==True):

    print ("Welcome to online shopping list!")
    itemA=input ("Would you like to add/remove items?")
    if (itemA=="add"):
        itemB=input ("What would you like to add?")
        print (itemB)
        list.append (itemB)
        
        if (list.count(itemB)==0):
            list.append (itemB)
        
        if(list.count(itemB)==2):
            print ("You already listed that item, silly!")
            list.remove (itemB)
    print (list)
    if (itemA== "remove"):
        itemC=input ("What would you like to remove?")
        print (itemC)
        if (list.count(itemC)==0):
            print ("Your list doesn't have that item, silly!")
        elif(list.count(itemC)>0):
            list.remove (itemC)
        print (list)
    
    
    result=input ("Way to go! Would you like to quit?")
    print (result)
    if (result=="yes"):
        print ("Time to go shopping! Until next time!")
        shopping=False

