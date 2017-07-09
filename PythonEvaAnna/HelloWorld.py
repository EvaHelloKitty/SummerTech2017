#SHOULD DISPLAY WEAPONS TO IMPORT TO LUNAR CHRONICLES GAME
shopping=True
list=[]
while (shopping==True):
    
    print ("CINDER WEAPONS:\n     1. Tranquilizer Darts - 'Military Opiate Darts' Class [Projectile] Damage[10] Value[3] Quantity[5]\n     2. Wrench - 'Mechanic Wrench' Class [Projectile] Damage[10] Value[3] Quantity[5]\n ")
    print ("SCARLET WEAPONS:\n     1. Pistol - Class [Gun] Damage[25] Value[7] Quantity[12]\n     2. Shotgun - Class [Gun] Damage[30] Value[9] Quantity[7]\n ")
    print ("IKO WEAPONS:\n     FOR SHIP:\n     1. Ista-Cannon- Class [Vehicle Projectile] Damage [30] Value [15] Quantity [25]\n     2. Perfume Gas- 'Immobalizes Victim for 10 Hours' Class [Airnorne Intoxicant] Damage [10] Value [3] Quantity [3]\n     FOR ANDROID: \n     1. Stun Gun- class[Gun] Damage [10] Value [3] Quantity [3]\n ")
    print ("CRESS WEAPONS:\n     1. Handknife- 'For Defensive Use in Close Combat' Class [Knife] Damage[15] Value[5] Quantity[1]\n     1. Stun Darts - 'Immobalizes Victim for 10 Hours' Class [Projectile] Damage[10] Value[3] Quantity[3]\n ")
    
    print(list)
    print ("Here, you can operate your invetory.\n Would you like to add or remove items?")
    answer1=input("")
    
    if(answer1=="add"):
        item=input("What Items Would You Like to Add to Your Invetory?\n Pick Three.\n ")
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
        print("Here is your current invetory:")
        print (list)

                                              
    

         
    
    

