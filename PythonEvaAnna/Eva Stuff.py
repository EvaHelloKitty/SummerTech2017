shopping=True
list=[]
while (shopping==True):
    print ("Welcome to MBTI Calculator!")
    answer1=input ("Type start to continue")
    if (answer1=="start"):
        print ("Yay!")
    
    question1= input ("Are you I (Introverted) or E (Extaverted)? Type a question mark for more information.")
    
    if (question1== "I"):
        list.append (question1)
        print (list)
    
    if (question1== "E"):
        list.append (question1)
        print (list)
        
    if (question1== "?"):
        print ("The first question reflects what generically energizes a person. Extraverted types learn best by talking and interacting with others. By interacting with the physical world, extraverts can process and make sense of new information. Introverted types prefer quiet reflection and privacy. Information processing occurs for introverts as they explore ideas and concepts internally.")
        
        question100= input ("Are you I (Introverted) or E (Extaverted)?")
    
        if (question100== "I"):
            list.append (question100)
            print (list)
        
        if (question100== "E"):
            list.append (question100)
            print (list)
         
    question2= input ("Are you S (sense) or N (intuition)? Type a question mark for more info.")
    
    if (question2== "S"):
        list.append (question2)
        print (list)
        
    if (question2== "N"):
         list.append (question2)
         print (list)
        
    if (question2== "?"):
        print ("This question refers to how you register information. Sensing people often stick with the facts, while Intuitions enjoy the BIG PICTURE")
    
        question200= input ("Are you S (sense) or N (intuition)?")
    
        if (question200== "S"):
            list.append (question200)
            print (list)
        
        if (question200== "Nstart"):
            list.append (question200)
            print (list)
            
    question3= input ("Are you a T (thinker) or an F (feeler)? Type a question mark for more info.")
    
    if (question3== "T"):
        list.append (question3)
        print (list)
        
    if (question3== "F"):
        list.append (question3)
        print (list)
        
    if (question3== "?"):
        print ("This refers to how you solve problems. Thinkers think through possibilities to find soulutions while feelers 'let their concience be their guide'")
        
        question300= input ("Are you a T (thinker) or an F (feeler)?")
        
        if (question300== "T"):
         list.append (question300)
         print (list)
        
        if (question300== "S"):
            list.append (question3)
            print (list)
        
    question4= input ("Are you a J (judger) or P (perciever?")
     
  
    if (question4== "J"): 
        list.append (question4)
        print (list)
        
    if (question4== "P"):
        list.append (question4)
        print (list)
        
    if (question4== "?"):
        print ("This question asks how you confront deadlines. Judgers make strict dates to carry out work while Percievers tend to procrastinate and throw dates around.")
        
        question400= input ("Are you a J (judger) or P (perciever?")
        
        if (question400== "J"):
            list.append (question400)
            print (list)    
        
        if (question400== "P"):
            list.append (question400)
            print (list)
          
    code= input ("Now, input your 4 letter code in caps here to get your result")
    
    if (code== "ISTJ"):
        print ("Quiet, serious, earn success by thoroughness and dependability.\nPractical, matter-of-fact, realistic, and responsible.\nDecide logically what should be done and work toward it steadily, regardless of distractions.\nTake pleasure in making everything orderly and organized – their work, their home, their life.\nValue traditions and loyalty.") 
            
    if (code== "ISFJ"):
        print ("Quiet, friendly, responsible, and conscientious.\nCommitted and steady in meeting their obligations.\nThorough, painstaking, and accurate. Loyal, considerate, notice and remember specifics about people who are important to them, concerned with how others feel. Strive to create an orderly and harmonious environment at work and at home.")
            
    if (code== "INFJ"): 
        print ("Seek meaning and connection in ideas, relationships, and material possessions. Want to understand what motivates people and are insightful about others. Conscientious and committed to their firm values. Develop a clear vision about how best to serve the common good. Organized and decisive in implementing their vision.")
    
    if (code== "INTJ"):
       print ("Have original minds and great drive for implementing their ideas and achieving their goals. Quickly see patterns in external events and develop long-range explanatory perspectives. When committed, organize a job and carry it through. Skeptical and independent, have high standards of competence and performance – for themselves and others.")
       
    if (code=="INTJ"):
       print ("Have original minds and great drive for implementing their ideas and achieving their goals. Quickly see patterns in external events and develop long-range explanatory perspectives. When committed, organize a job and carry it through. Skeptical and independent, have high standards of competence and performance – for themselves and others.")
       
    if (code=="ISTP"):
       print ("Your Description: Tolerant and flexible, quiet observers until a problem appears, then act quickly to find workable solutions. Analyze what makes things work and readily get through large amounts of data to isolate the core of practical problems. Interested in cause and effect, organize facts using logical principles, value efficiency.")
        
    if (code=="ISFP"):
        ptint ("Quiet, friendly, sensitive, and kind. Enjoy the present moment, what’s going on around them. Like to have their own space and to work within their own time frame. Loyal and committed to their values and to people who are important to them. Dislike disagreements and conflicts, do not force their opinions or values on others.")  
        
    if (code=="INFP"):
        print ("Idealistic, loyal to their values and to people who are important to them. Want an external life that is congruent with their values. Curious, quick to see possibilities, can be catalysts for implementing ideas. Seek to understand people and to help them fulfill their potential. Adaptable, flexible, and accepting unless a value is threatened.")
        
    if (code=="INTP"):
        print ("Seek to develop logical explanations for everything that interests them. Theoretical and abstract, interested more in ideas than in social interaction. Quiet, contained, flexible, and adaptable. Have unusual ability to focus in depth to solve problems in their area of interest. Skeptical, sometimes critical, always analytical.")
        
    if (code=="ESTP"):
        print ("Flexible and tolerant, they take a pragmatic approach focused on immediate results. Theories and conceptual explanations bore them – they want to act energetically to solve the problem. Focus on the here-and-now, spontaneous, enjoy each moment that they can be active with others. Enjoy material comforts and style. Learn best through doing.")
        
    if (code=="ESFP"):
        print ("Outgoing, friendly, and accepting. Exuberant lovers of life, people, and material comforts. Enjoy working with others to make things happen. Bring common sense and a realistic approach to their work, and make work fun. Flexible and spontaneous, adapt readily to new people and environments. Learn best by trying a new skill with other people.")
        
    if (code=="ENFP"):
        print ("Warmly enthusiastic and imaginative. See life as full of possibilities. Make connections between events and information very quickly, and confidently proceed based on the patterns they see. Want a lot of affirmation from others, and readily give appreciation and support. Spontaneous and flexible, often rely on their ability to improvise and their verbal fluency.")
        
    if (code=="ENTP"):
        print ("Quick, ingenious, stimulating, alert, and outspoken. Resourceful in solving new and challenging problems. Adept at generating conceptual possibilities and then analyzing them strategically. Good at reading other people. Bored by routine, will seldom do the same thing the same way, apt to turn to one new interest after another")
        
    if (code=="ESTJ"):
        print ("Practical, realistic, matter-of-fact. Decisive, quickly move to implement decisions. Organize projects and people to get things done, focus on getting results in the most efficient way possible. Take care of routine details. Have a clear set of logical standards, systematically follow them and want others to also. Forceful in implementing their plans.")
        
    if (code=="ESFJ"):
        print ("Warmhearted, conscientious, and cooperative. Want harmony in their environment, work with determination to establish it. Like to work with others to complete tasks accurately and on time. Loyal, follow through even in small matters. Notice what others need in their day-by-day lives and try to provide it. Want to be appreciated for who they are and for what they contribute.")
        
    if (code=="ENFJ"):
        print ("Warm, empathetic, responsive, and responsible. Highly attuned to the emotions, needs, and motivations of others. Find potential in everyone, want to help others fulfill their potential. May act as catalysts for individual and group growth. Loyal, responsive to praise and criticism. Sociable, facilitate others in a group, and provide inspiring leadership.")
        
    if (code=="ENTJ"): 
        print ("Frank, decisive, assume leadership readily. Quickly see illogical and inefficient procedures and policies, develop and implement comprehensive systems to solve organizational problems. Enjoy long-term planning and goal setting. Usually well informed, well read, enjoy expanding their knowledge and passing it on to others. Forceful in presenting their ideas")
        
        
answer2=input("Would you like to continue?")
    
if(answer2=="yes"):
    shopping=True
    
elif(answer2=="no"):
    shopping=False
    print("Keep bieng you! Here's your code!")
    print (list)
        
        
        
    
        