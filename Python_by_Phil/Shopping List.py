shopping=True
list=[]
while (shopping==True):
    
    print ("Hey, its about time you added to your shopping list.")
    answer1=input("So...would you like to add/remove anything?")
    if(answer1=="add"):
        item=input("What would you like to add?")
        list.append(item)
        list.count(item)
        if (list.count(item)==2):
            print("Hey,you already added one of those!")
            list.remove(item)
        print(list)
    elif(answer1=="remove"):
        item1=input("What would you like to remove?")
        list.count(item1)
        if (list.count(item1)==0):
            print("You can't remove it! It's not even on the list in the first place!")
        elif(list.count(item1)>0):
            list.remove(item1)
        print (list)
    answer2=input("Would you like to continue?")
    if(answer2=="yes"):
        shopping=True
    elif(answer2=="no"):
        shopping=False
        print("Enjoy your shopping! Here's your list!")
        print (list)
        