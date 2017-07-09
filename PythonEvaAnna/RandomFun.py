lunarchronicles4ever=True
list=[]
while (lunarchronicles4ever==True):
    
    print ("Think you're ready to save the universe? Think you got what it takes to take down Queen Levana?")
    answer1= input ("Type start to begin")
    if (answer1=="start"):
        print ("You've been accepted! Congats and good luck!")
        
        print ("Choose your Lunar Chronicles Identity")
        print ("A- Cinder! She absoulutely rocks!")
        print ("B- Iko. Peppy and awesome all the way!")
        print ("C- Scarlet. Like the hair, right?")
        print ("D- Prince Kai. He is just too cool commonwealth")
        print ("E- Wolf. AWOOOOOOOOOOOOW!")
        print ("F- Cress. Her hair is just to die for!")
        print ("G- Levana! BOOOOOOOO! You smell! Get off the stage!")
        print ("H- Thorne. I have a way with people :D")
        
        
        
        identity1= input ("Pick a Letter and Type it In: ").upper()
        
        
        # THIS IS CINDER'S SECTION LEVEL: TUTORIAL
        if (identity1=="A"):
            print ("Good Choice! Begin the cyborg/princess awesomeness!\n")
            print ("-MAJOR OBJECTIVE: You need to take down the Queen before she \n     A. marries Prince Kai.\n     B. becomes empress.") 
            print ("-Even though you are currently training to use your lunar powers, you and the rest of the crew have to land for a variety of reasons.")
            print ("-CURRENT MINOR OBJECTIVE: Wolf has given you a list. You and your battle buddy Throne need to collect the items and nt get spotted.")
            print ("-You touch down in a small town in Europe. OBJECTIVE You need to collect the following items:\n darts, CSD engine parts, medical bandages and a solar power cell")
            print ("-WARNING: Careful witht your wiring. It's hot and you could overheat. \nYou also have to be on the look out for anyone who can report you")
            print ("-NOTE: you are covering your cyborg parts. They're not as wecomed in this area.")
            gotthat= input (" \nGot all that?").upper()
            if (gotthat=="YES"):
                print ("Good!")
            print (" \nYou find a crossroads on your path. Your retania vision has no GPS information for this particular road. Both, you think will take you to the city")
            whichway= input ("Right or Left. Which way do you choose?\n ").upper()
            if (whichway=="RIGHT"):
                print (" \nThe path you choose will take down a synic road through a forest.\nEver since your encounter in Paris, you're afraid that Wolf Hybrids lurk in these places. Be careful.")
                print (" \nYou hear a noise in the bushes.")
                noise1= input ("Do you choose:\n     A. to use one of your 3 darts\n     Or\n     B. hide behind Thorne and pray whatever it is won't find you?").upper()
                if (noise1=="A"):
                    print (" \nYou miss.\nThe noise was a squirrel.\nYou are down to two darts. You keep walking")
                if (noise1=="B"):
                    print (" \nThorne has scared the squirrel that made the noise away.\nYou still have 3 darts. You continue on into the city!")
             
          
        
            if (whichway=="left"): 
                print ("Left it is!")
                print ("The path you choost takes you to a sidewalk and you continue on.")
                print ("Thorne is being annoying.") 
                annoying= input ("Do you\n     A ignore him? or\n    B tell him to stop?").upper()
                if (annoying=="A"):
                    print ("Thorne keeps annoying you. You walk on until enter the border of the city")
            
                if (annoying=="B"):
                    print ("Thorne keeps annoying you. You walk on until you enter the city.")
                    
                    
            print (" \n-You have entered the city of Gerenon.\n-It is a hot day and people are outside.\n-Remember to keep cool so you don't overheat your wiring.")
            
            print ("Thorne suggests that you begin by purchasing either A the medical bandages or B the solar cell because those are the closest shops.")
            purchase= input ("Which would you like to buy?").upper()
            
            if (purchase=="A"):
                print ("Throne agrees and you both head to a pharmacy across the street.\n ")
                print ("You open the door.\nThere are not many people there.\nSelf conciously you check your boots and cloves.\nNo metal shows.\nYou're safe\n   ")
                print ("While there you see a man with a tatoo like Wolf's. It's a pack member.")
                print ("Do you try to sneak around and buy the supplies or use a dart and get it over with before he discovers you?")
                
                runninfromwolves= input ("Fight or Flight?").upper()
                if (runninfromwolves=="FIGHT"):
                    print ("Just as the wolf/man lunges for a city resident you use on of your tranquilizers. He falls unconcious.")
                    print ("While Thorne drags the wolf/man away, you buy the medical bandages.")
                    print ("the shop keeper climbs out from under his counter and even gives you a discount for removing the wolf. You continue on.")
                    
                if (runninfromwolves=="FLIGHT"):
                    print ("You Hide behind an aisle as the pack member prowls around. He is already smelling and the slightest movement will attract attention")
                    print ("You see on your retania display that Iko is trying to send you a message on Scarlet's portscreen in your bag. Important.")
                    justpickup= input ("Do you\n     A answer it because you think it might be an emergancy?\n     B dismiss the call to protect yourselves?").upper()
                    if (justpickup== "A"):
                        print ("Iko begins to tell you about a scanner pick up when you hear the man luging over. You dismiss the call but it is too late")
                        print (" The Wolf spots you and you have to run. Throne has already purchased the items you need, but you don't stop to think about it.")
                        
                    if (justpickup== "B"):
                        print ("The wolf found you! RUN! RUUUUUUUUUN CINDER!")  
                        
                    gift= input ("Do you A tranquilize the man, B keep running for the ship or C try to use your new lunar gift?")
                    if (gift== "A"):
                        print ("You use a dart to tranquilize the man and contine to buy the next item on your list.")
                    if (gift== "B"):
                        print ("You keep running for the ship. Wolf eventually defeats the other Wolfpack guy and tells you to wait. Then you go back to shopping.")
                    if (gift== "C"):
                        print ("You try to use your gift, though its not as effective when running. Eventually you get him to pass out and head back to shopping.")
                    
                
                print ("You and Thorne walk on, looking for the repair parts store Thorne saw on a map on the Rampion.")
                print ("Iko calls on Scarlet's portscreen in your messenger bag. You have been picked up on nearby scanners. You don't have much time to lose before officers come")
                print ("You walk into a repair store and eventually find the solar cell you need. It is expensive but your combined group has the money you need.")
                print ("You try to buy the parts but the man in the store doesn't want to sell them to you.")
                macarana= input ("Do you A glamour him and risk him telling people B Throw the money on his desk and run out of the store really fast or C grab Thorne and start winning him over in dance?")
                if (macarana=="A"):
                    print ("You glamour him. Immedietly he sells you the product. You have less time now because the sale will not go unnoticed. You have to move fast. You move on.")
                if (macarana=="B"):
                    print ("You throw the money on his dek, swipe the cell and run for it. Thorne follows you, along with the shop keeper. Careful, this could go on the nets")
                    print ("Careful. You don't want everyone to take special intrest. It'll be easier for them to hunt you down. You keep going.")
                if (macarana=="C"):
                    print ("You grab Thorne and start to do the macarana and gaugum style. The shop keeper is giving you a funny look, but people around you like it")
                    print ("They give you tips for your dance, and the extra money is enough for the shop keeper to leave you alone! Good soulution! You keep going!")
            
            
            
            
            
            
            if (purchase=="B"):
                print ("-You and Thorne walk on looking for the repair parts store Thorne saw on a map on the Rampion.")
                print ("-Iko calls on Scarlet's portscreen in your messenger bag. You have been picked up on nearby scanners.\nYou don't have much time to lose before officers come")
                print ("You walk into a repair store and eventually find the solar cell you need.\nIt is expensive but your combined group has the money you need.")
                print ("You try to buy the parts but the man in the store doesn't want to sell them to you.")
                macarana= input ("Do you: \n   A glamour him and risk him telling people \n   B Throw the money on his desk and run out of the store really fast or \n   C grab Thorne and start winning him over in dance?")
                if (macarana=="A"):
                    print ("You glamour him.\nImmedietly he sells you the product.\nYou have less time now because the sale will not go unnoticed.\nYou have to move fast.\nYou move on.")
                if (macarana=="B"):
                    print ("You throw the money on his dek, swipe the cell and run for it.\nThorne follows you, along with the shop keeper.\nCareful, this could go on the nets")
                    print ("Careful. You don't want everyone to take special intrest.\nIt'll be easier for them to hunt you down. You keep going.")
                if (macarana=="C"):
                    print ("You grab Thorne and start to do the macarana and gaugum style. The shop keeper is giving you a funny look, but people around you like it")
                    print ("They give you tips for your dance, and the extra money is enough for the shop keeper to leave you alone!\nGood soulution!\nYou keep going!")
                
                print (" \nThrone suggests you buy the bandages and you both head to a pharmacy across the street.")
                print ("You open the door. There are not many people there. Self conciously you check your boots and cloves. No metal shows. You're safe")
                print ("While there you see a man with a tatoo like Wolf's. It's a pack member.")
                print ("Do you try to sneak around and buy the supplies or use a dart and get it over with before he discovers you?")
                runninfromwolves= input ("Fight or Flight?")
                if runninfromwolves in ("Fight", "fight", "FIGHT"):
                    print ("Just as the wolf/man lunges for a city resident you use on of your tranquilizers. He falls unconcious.")
                    print ("While Thorne drags the wolf/man away, you buy the medical bandages.")
                    print ("the shop keeper climbs out from under his counter and even gives you a discount for removing the wolf. You continue on.")
                    
                if runninfromwolves in ("Flight", "flight", "FLIGHT"):
                    print ("You Hide behind an aisle as the pack member prowls around. He is already smelling and the slightest movement will attract attention")
                    print ("You see on your retania display that Iko is trying to send you a message on Scarlet's portscreen in your bag. Important.")
                    justpickup= input ("Do you:\n    A answer it because you think it might be an emergancy\n    B dismiss the call to protect yourselves?")
                    if (justpickup== "A"):
                        print ("Iko begins to tell you about a scanner pick up when you hear the man luging over. You dismiss the call but it is too late")
                        print (" The Wolf spots you and you have to run. Throne has already purchased the items you need, but you don't stop to think about it.")
                        
                    if (justpickup== "B"):
                        print ("The wolf found you! RUN! RUUUUUUUUUN CINDER!")  
                             
                    gift= input ("Do you:\n    A. tranquilize the man\n    B. keep running for the ship\n    C. try to use your new lunar gift")
                    if (gift== "A"):
                        print (" \nYou use a dart to tranquilize the man and contine to buy the next item on your list.")
                    if (gift== "B"):
                        print (" \nYou keep running for the ship. Wolf eventually defeats the other Wolfpack guy and tells you to wait. Then you go back to shopping.")
                    if (gift== "C"):
                        print (" \nYou try to use your gift, though its not as effective when running. Eventually you get him to pass out and head back to shopping.")

                
                callback = input (" \nWolf has called you back to the ship. The Rampion is under attack.")
                
                print ("Congratulations! You have passed the Tutorial for LunarChronicles: Cinder Lihn!")
                continue1Cinder = input ("Please type the word 'YES' in all caps to continue on to level two.\nIf you choose not to, you will be returned to the begining\nwhere you can choose another character.")
                
        
        # THIS IS IKO'S SECTION LEVEL: TUTORIAL
        if (identity1=="B"):
            print ("Good choice! Iko is has such good taste! Begin the android coolness!")
            print ("Right now you are progammed in the Rampion, Thorne's stolen ship. You are waiting for another body to use, but you make use of what you have")
            print ("Cinder has gone with Thorne to buy supplies. Everyone has a job to do. OBJECTIVE You need to entertain yourself without getting distacted and into trouble.")
            print ("WARNING: Keep yourself off the nearby scanners! You are harboring fugatives.")
            print ("To avoid being picked up you need to know three four-character codes to give when you get the inital")
            print ("CODES: 1111 (Identification) 2222 (Access) 3333 (Dismissal)")
            print ("You must be consistent with the codes while watching the Prince Kai fan blogs and gossip.")     
            gotallthatiko= input ("Got all that?") 
            if (gotallthatiko=="yes"):
                print ("GREAT!")
            print ("What will you do first?")
            androidsjustwannahavefun= input ("A Check the fan blogs for the latest or B Make sure I'm not setting off any alarms")
            if (androidsjustwannahavefun=="A"):
                print ("Fan blogs it is!")
                kaiiscool= input ("A post reflects on the question: Would prince Kai look better dressed as A a cute racoon or B a very handsome platapus?")
                if (kaiiscool=="A"):
                    print ("Totally. Think of the little striped tail! ADORABLE!")
                    color= input ("Should the official Kai fan blog official color be A red or B blue?")
                    if (color=="A"):
                        print (" Applying color to fanblog. Red is so him.")
                    if (color=="B"):
                        print ("Applying color to fanbog. Blue is just so royal!")
                        
                    print ("UNKNOWN SHIP IDENTIFY YOURSELF.")
                    code= input ("INSERT 4 DIGIT CODE")
                    if (code=="1111"):
                        print ("FLIGHT PERMISSION GRANTED. THANK YOU")
                        print ("You are safe. Good work Iko. What would you like to do now?")
                        
                    else:
                        print ("Your Crew Has Been Arrested by the Commonwealth Military in service to the lunar court")
                        print ("GAME OVER.\n--------------------------------\n \nYou will now be directed to the begining for another chance to save the world.")
                        print (" \nDon't worry! It's only the tutorial\n See you next time!")
                            
                        
                if (kaiiscool=="B"):
                    print ("Oh yes! The platapus just cannot be topped. Then again, Kai looks so good in everything!")
                    bestfeature= input ("What, in your opinion, is Kai's best feature? A his warm eyes or B his smile?")
                    if (bestfeature=="A"):
                        print ("The dreamy eyes are perfect. Hold on, you have a call from a nearby tracker. Keep calm and dismiss it with your code!")
                        print ("YOU HAVE BEEN PICKED UP, PLEASE.... (now Iko! put in the code or you'll be tracked!")
                        codelyoko= input ("HURRY!")
                        if (codelyoko== "3333"):
                            print ("Good job Iko. The ship is off the scanners well done!")
                    if (bestfeature=="B"):
                        print ("The smile can turn a girl to gravy! Aw!")
                        print ("YOU HAVE BEEN PICKED UP, PLEASE.... (now Iko! put in the code or you'll be tracked!")
                        codelyoko= input ("HURRY!")
                        if (codelyoko== "3333"):
                            print ("Good job Iko. The ship is off the scanners well done!")
                print ("A new fan post was just posted.")
                print ("The newest dress in the Commonwealth fashion line is said to be the prettiest yet. It's silver with purple ribbons in some places.")
                print ("http://i01.i.aliimg.com/wsphoto/v0/664354249_1/Striking-Off-The-Shoulder-Lac-Purple-Ribbon-Sleeveless-Organza-Wedding-Dress-Ball-Gown.jpg")
                dress= input ("The skirt has layers of laces and bodice. Do you approove?")
                if (dress=="yes"):
                    print ("Over 3,452 fans agree with you. Some even say Levana should wear it to the wedding.")
                if (dress=="no"):
                    print ("You're right. Silver and purple are just not meant to be.")
                    
                whatnext= input ("Would you like to A look at more fashion or B check the Kai fan blogs?")
                if (whatnext=="A"):
                    print ("This next outfit features a short semi-formal dress with a bejewled neck collar. It frills at the bottom in mesh fabric layers")
                    print ("The dress is blue and the jewles are knock off saphires. ")
                    print ("http://img1.simplydresses.com/_img/SDPRODUCTS/1248911/1000/royal-dress-PO-6842-d.jpg")
                    doyoulike= input ("Do you like this one better than the previous one?")
                    if (doyoulike=="yes"):
                        print ("Of course it is! Iko you have a gift for fashion! This dress is gorgeous!")
                    if (doyoulike== "no"):
                        print ("Yeah....the other one is truly spectacular. Who is that designer??")
                    
                    
                    
                    
            if (androidsjustwannahavefun=="B"):
                print ("Let's have a looksee at those scanners.")
                print ("You aren't on any scanners at the moment.")
                print ("A new fan post was just posted.")
                print ("The newest dress in the Commonwealth fashion line is said to be the prettiest yet. It's silver with purple ribbons in some places.")
                print ("http://i01.i.aliimg.com/wsphoto/v0/664354249_1/Striking-Off-The-Shoulder-Lac-Purple-Ribbon-Sleeveless-Organza-Wedding-Dress-Ball-Gown.jpg")
                dress= input ("The skirt has layers of lace. Do you approove?")
                if (dress=="yes"):
                    print ("Over 3,452 fans agree with you. Some even say Levana should wear it to the wedding.")
                if (dress=="no"):
                    print ("You're right. Silver and purple are just not meant to be.")
                
                whatnext= input ("Would you like to A look at more fashion or B check the Kai fan blogs?")
                if (whatnext=="A"):
                    print ("This next outfit features a short semi-formal dress with a bejewled boat neck collar. It frills at the bottom in mesh fabric layers")
                    print ("The dress is blue and the jewles are knock off saphires. ")
                    print ("http://img1.simplydresses.com/_img/SDPRODUCTS/1248911/1000/royal-dress-PO-6842-d.jpg")
                    doyoulike= input ("Do you like this one better than the previous one?")
                    if (doyoulike=="yes"):
                        print ("Of course it is! Iko you have a gift for fashion! This dress is gorgeous!")
                    if (doyoulike== "no"):
                        print ("Yeah....the other one is truly spectacular. Who is that designer??")
                    kaiiscool= input ("A post reflects on the question: Would prince Kai look better dressed as A a cute racoon or B a very handsome platapus?")
                    if (kaiiscool=="A"):
                        print ("Totally. Think of the little striped tail! ADORABLE!")
                        color= input ("Should the official Kai fan blog official color be A red or B blue?")
                        if (color=="A"):
                            print (" Applying color to fanblog. Red is so him.")
                        if (color=="B"):
                            print ("Applying color to fanbog. Blue is just so royal!")
                        
                        print ("UNKNOWN SHIP IDENTIFY YOURSELF.")
                        code= input ("INSERT 4 DIGIT CODE")
                        if (code=="1111"):
                            print ("FLIGHT PERMISSION GRANTED. THANK YOU")
                            print ("You are safe. Good work Iko. What would you like to do now?")
                        
                    if (kaiiscool=="B"):
                        print ("Oh yes! The platapus just cannot be topped. Then again, Kai looks so good in everything!")
                        bestfeature= input ("What, in your opinion, is Kai's best feature? A his warm eyes or B his smile?")
                        if (bestfeature=="A"):
                            print ("The dreamy eyes are perfect. Hold on, you have a call from a nearby tracker. Keep calm and dismiss it with your code!")
                            print ("YOU HAVE BEEN PICKED UP, PLEASE.... (now Iko! put in the code or you'll be tracked!")
                            codelyoko= input ("HURRY!")
                            if (codelyoko== "3333"):
                                print ("Good job Iko. The ship is off the scanners well done!")
                        if (bestfeature=="B"):
                            print ("The smile can turn a girl to gravy! Aw!")
                            print ("YOU HAVE BEEN PICKED UP, PLEASE.... (now Iko! put in the code or you'll be tracked!")
                            codelyoko= input ("HURRY!")
                            if (codelyoko== "3333"):
                                print ("Good job Iko. The ship is off the scanners well done!")
                    
                            
                check= input ("Iko! It's Wolf. Are you picking up anything on the scanners?")
                if (check=="no"):
                    print ("good")
                    
                print ("\n***************************************************************************************************\n")
                print ("WOLF: I don't know....I have a feeling something fishy is going on. We have to be on our toes.\n")
                print ("Cinder just reported to me that she saw a Pack member in the village. We better scidale soon.\n")
                print ("IKO: I don't see anything out of the.....wait a minute. Uh oh.\n")
                print ("SCARLET: What is it Iko?\n")
                print ("IKO: We've been picked up! How did this happen? I was so careful!\n")
                print ("SCARLET: The lunar soldiers! They must have! No offense.....\n")
                print ("WOLF: None taken, Scarlet. It's fine. I know them. I know what they are capable of. They'll stop at nothing to please Levana.\n")
                print ("IKO: What should I do? Try to dismiss the scanners?\n")
                print ("WOLF: Too late, I smell something. We're under attack! I'm calling Cinder, we need to go, NOW!\n")
                
                
                
        
        # THIS IS SCARLET'S SECTION LEVEL: TUTORIAL
        if (identity1=="C"):
            print ("Great Choice! Scarlet is as awesome as she is beautiful!")
            print ("Right now you are aboard the Rampion. Cinder and Thorne have gone out shopping. That leaves you, Iko and Wolf aboard.")
            print ("Of course, it's gotten boring really fast, so you try to lighten the mood with some tomatoes as you think of something to do.")
            imsoboredicouldscream= input ("Wouls you like to A look over your objectives for comming up or B spend some time with your friends?")
            if (imsoboredicouldscream=="A"):
                print ("Of course. Your potscreen gives you instant access to all the maps and information you need.")
                print ("After getting the supplies Cinder is buying you will hit two check points before seeking out the queen herself.")
                print ("Iko's taking care of keeping everything off the scanners, so all you can really do is relax and wait.")
                print ("You find Wolf in the makeshift sitting area. It's time for something to do.")
                print ("You can A play a board game B teach Wolf to do something or vice versa, or C watch a net drama.")
                bestdayever= input("What will you choose?")
                if (bestdayever=="A"):
                    print ("That's a great idea. Playing a board game will take everyone's mind off the task.")
                    print ("There are lots of games to play. From Go Fish to Checkers the fun never stops!")
                    game= input ("What would you like to play?")
                    if (game=="I don't know"):
                        print ("Cool! That'll keep you entertained!")
                        print ("Wow, Wolf is better at games than you thought! You can win, Scarlet!")
                    
                if (bestdayever=="B"):
                    print ("That's a good idea. Learning more skills will enhance your chance to beat Levana.")
                    print ("Since you don't know anything about battle tactics, you might start by teaching Wolf to cook.")
                    cooking = input ("Do you want to teach Wolf to cook?<input 'yes' to affirm>")
                    if cooking in ("yes", "Yes", "YES"):
                        print (" \n><><><><><><><><><><><><><><><><><><><\n ")
                        print ("IKO: WHAT IS GOING ON!? My explosion alarm just....WOlF! What is THAT!?\n  ")
                        print ("WOLF: It's a cupcake.....well, it was a cupcake.......\n  ")
                        print ("SCARLET: I'm sure it's great Wolf (takes one and stuffs in mouth) (smiles)\n ")
                        print ("IKO: Awwww! It's a Wolflet moment! I have to blog about this!!!!!\n ")
                        print ("WOLF: Wolf-let? I'm not even going to ask.....n\  ")
                        print ("Iko: Well, it looks like we're going to have to work on that baking.....\n  ")
                    
                    print ("Wolf: Why don't I show you how to fight? I won't hurt you, I promise")
                    print ("Iko: That's what they always say....\n    ")
                    fight1 = input ("WOULD YOU LIKE TO FIGHT?\n<input 'yes' to train>")
                    if fight1 in ("yes", "Yes", "YES"):
                        print ("Here, pretend I'm a Lunar Oprative....Oh, yeah, I forgot I actually am one. Anyway, If I come at you this way, left, which way are you going to turn?")
                        responses= input ("A: Right!\n B: Left!\n")
                        if (responses=="A"):
                            print ("Wolf: That's right! Turn your shoulder this way...that's it. And pull it back. You go left if he's lunging the other way.")
                        if (responses=="B"):
                            print ("Wolf: Nope! The attacker goes left, so you go right to avoid. It's okay, this stuff takes time to learn.")
                    else: exit  
                        
                
                if (bestdayever=="C"):
                    print ("You flick through Iko's movie collections on her net screen. You come across two movies: A, 'Night of the Werewolf Princess', or B, 'Forgotten Love'")
                    netscreenmovie= input ("What will you choose?")
                    if (netscreenmovie=="A"):
                        print ("Excellent choice! This movie is popular right now, so it should be good.")
                        print("You put in the movie and sit on the couch with Wolf.")
                        print ("\n XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX \n ")
                        print ("One Hour Later:")
                        print ("TV: 'Now,  must go, before I turn into a monster'...'No! Rachel you can't leave me here to fight alone! I need you!'")
                        print ("Wolf: Scarelt? Are you...crying?")
                        print ("Scarlet: (nods) Mm Hm (wipes tear)")
                        print ("Wolf: Awwww, don't cry Scarlet (hug) It's just a movie")
                        print ("Iko: Oh just wait! We haven't gotten to the death scene! That's REALLY bad.")
                        print ("Scarlet: (hiccups) Dddddeath scene?")
                        print ("Iko: Oooops! I said too much. I forgot you haven't seen the movie a billion times.")
                    if (netscreenmovie=="B"):
                        print("")
    
                
            if (imsoboredicouldscream=="B"):
                print ("Good choice! Iko's taking care of keeping everything off the scanners, so all you can really do is relax and wait.")
                print ("You find Wolf in the makeshift sitting area. It's time for something to do.")
                print ("You can A play a board game B teach Wolf to do something or vice versa, or C watch a net drama.")
                bestdayever= input("What will you choose?")
                if (bestdayever=="A"):
                    print ("That's a great idea. Playing a board game will take everyone's mind off the task.")
                    print ("There are lots of games to play. From Go Fish to Checkers the fun never stops!")
                    game= input ("What would you like to play?")
                    if (game=="I don't know"):
                        print ("Cool! That'll keep you entertained!")
                        print ("Wow, Wolf is better at games than you thought! You can win, Scarlet!")
                    
                if (bestdayever=="B"):
                    print ("That's a good idea. Learning more skills will enhance your chance to beat Levana.")
                    print ("Since you don't know anything about battle tactics, you might start by teaching Wolf to cook.")
                    print (" \n XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX \n ")
                    print ("IKO: WHAT IS GOING ON!? My explosion alarm just....WOlF! What is THAT!?")
                    print ("WOLF: It's a cupcake.....well, it was a cupcake.......")
                    print ("SCARLET: I'm sure it's great Wolf (takes one and stuffs in mouth) (smiles)")
                    print ("IKO: Awwww! It's a Wolflet moment! I have to blog about this!!!!!")
                    print ("WOLF: Wolf-let? I'm not even going to ask.....")
                        
                    print ("Iko: Well, it looks like we're going to have to work on that baking.....")
                    
                    print ("Wolf: Why don't I show you how to fight? I won't hurt you, I promise")
                    print ("Iko: That's what they always say....\n      ")
                    fight1 = input ("WOULD YOU LIKE TO FIGHT?\n<input 'yes' to train>")
                    if fight1 in ("yes", "Yes", "YES"):
                        print ("Here, pretend I'm a Lunar Oprative....Oh, yeah, I forgot I actually am one. Anyway,\nIf I come at you this way, left, which way are you going to turn?")
                        responses= input ("A: Right!\n B: Left!\n")
                        if (responses=="A"):
                            print ("Wolf: That's right! Turn your shoulder this way...that's it. And pull it back. You go left if he's lunging the other way.")
                        if (responses=="B"):
                            print ("Wolf: Nope! The attacker goes left, so you go right to avoid. It's okay, this stuff takes time to learn.")
                
                if (bestdayever=="C"):
                    print ("You flick through Iko's movie collections on her net screen. You come across two movies: A, 'Night of the Werewolf Princess', or B, 'Forgotten Love'")
                    netscreenmovie= input ("What will you choose?")
                    if (netscreenmovie=="A"):
                        print ("Excellent choice! This movie is popular right now, so it should be good.")
                        print("You put in the movie and sit on the couch with Wolf.\n ")
                        print ("\n XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX \n ")
                        print ("One Hour Later:")
                        print ("TV: 'Now,  must go, before I turn into a monster'...'No! Rachel you can't leave me here to fight alone! I need you!'")
                        print ("Wolf: Scarelt? Are you...crying?")
                        print ("Scarlet: (nods) Mm Hm (wipes tear)")
                        print ("Wolf: Awwww, don't cry Scarlet (hug) It's just a movie")
                        print ("Iko: Oh just wait! We haven't gotten to the death scene! That's REALLY bad.")
                        print ("Scarlet: (hiccups) Dddddeath scene?")
                        print ("Iko: Oooops! I said too much. I forgot you haven't seen the movie a billion times.")
    
                        

           
            

