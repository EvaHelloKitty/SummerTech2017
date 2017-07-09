import java.util.Scanner;

public class ArraysRecap {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		double bank = 1000000;

		String inventory[]= new String[13];
		for (int j=0;j<13;j++){
			inventory [j]="";
		}

		String array[]=new String[13];
		double price[]=new double [13];

		array[0]= "1 - Cat Express - Coach Car"; price[0]= 110000;
		array[1]= "2 - Cat Express - First Class Car"; price[1]= 115000;
		array[2]= "3 - Sphynx Superliner - Coach Car"; price[2]= 112000;
		array[3]= "4 - Sphynx Superliner - First Class Car"; price[3]= 117000;
		array[4]= "5 - Chartuex Shoreliner - Coach Car"; price[4]= 119000;
		array[5]= "6 - Chartuex Shoreliner - First Class Car"; price[5]= 124000;
		array[6]= "7 - Egyptian Mau Maglev - Coach Car"; price[6]= 126000;
		array[7]= "8 - Egyptian Mau Maglev- First Class Car"; price[7]= 131000;
		array[8]= "9 - Siamese Shinkansen- Coach Car"; price[8]= 133000;
		array[9]= "10 - Siamese Shinkansen - First Class"; price [9]= 138000;
		array[10]= "11 - Selkirk Rex Steamtrain - Sleeping Car"; price [10]= 140000;
		array[11]= "12 - Devon Rex Diesel Train - Dining Car"; price[11]= 142000;
		array[12]= "13 - Cornish Rex - Caboose"; price[12]= 105000;

		String description[]=new String[13];
		description[0]="\nThis comfortable coach car has  comfy seats, a nice view, and a complementary breakfast bar.\nComes with 16 varieties of cats.";
		description[1]="\nThis comfortable first class car comes with all of the luxuries of the comfortable car you love, but now with the added plush cuddlieness of cats.\nComes with 20 varieties of cats, complementary meals, and a repetitive travel movie depicting the highlights of life";
		description[2]="\nThis custom Superliner comes with big windows, soft chairs, a snack bar, and the unique extoticness of the Sphynx cat all in one!\nSuperliner: http://www.trainweb.org/f59phi450/amtrak/superliner/photos/amtk31021_011031.jpg\nSphynx Cat: http://m3.img.srcdd.com/farm5/d/2012/0520/14/52A8FC93159B78194DD784BCD5548B4B_B250_400_250_377.JPEG";
		description[3]="\nThis custom Superliner is one of the most unique luxury cars on the rails. Its efforltess comfort makes you forget you're even on the train, and the Sphynx cats add even more to the relxing expoerience.\n \nSuperliner: http://www.trainweb.org/f59phi450/amtrak/superliner/photos/amtk31021_011031.jpg\n \nSphynx Cat: http://m3.img.srcdd.com/farm5/d/2012/0520/14/52A8FC93159B78194DD784BCD5548B4B_B250_400_250_377.JPEG";
		description[4]="\nThis functional car gives off the chiq classiness with it's polished claw-proof leather seats, lushious carpets, and handsome Chartuex cats.\n \nTrain: https://www.google.com/search?q=shoreliner+train&safe=strict&espv=2&biw=1009&bih=445&source=lnms&tbm=isch&sa=X&ei=rgWcVbblIsas-AGCq7O4Bw&ved=0CAcQ_AUoAg#imgrc=CXrRHom4GwFL3M%3A\n \nCat: https://upload.wikimedia.org/wikipedia/commons/f/f8/MaschioCertosinodell'allevamentoFureurBleu_cropped.JPG";
		description[5]="\nThis luxury car gives off the chiq classiness with it's polished claw-proof leather seats, lushious carpets, and handsome Chartuex cats.\nAdded first class bonus' include(but are not limited to: seat warmers, satellite radio, glass table tops and a few cat-proof paintings depicting relaxing scenes.\n \nTrain: https://www.google.com/search?q=shoreliner+train&safe=strict&espv=2&biw=1009&bih=445&source=lnms&tbm=isch&sa=X&ei=rgWcVbblIsas-AGCq7O4Bw&ved=0CAcQ_AUoAg#imgrc=CXrRHom4GwFL3M%3A\n \nCat: https://upload.wikimedia.org/wikipedia/commons/f/f8/MaschioCertosinodell'allevamentoFureurBleu_cropped.JPG";
		description[6]="\nThis MEOWverlous Maglev combines the coolness of magnets with the rich ancient culture of Egypt. Big windows, exotic decorations and cuddly cool-looking give a certain 'king of the nile feel'.\n \nTrain: http://www.newscientist.com/data/images/ns/cms/dn3153/dn3153-1_370.jpg\n \nCat: http://40.media.tumblr.com/tumblr_mb6r5kNLQY1rh8diuo4_1280.jpg";
		description[7]="\nThis MEOWverlous Maglev combines the coolness of magnets with the rich ancient culture of Egypt. Big windows, exotic decorations and cuddly cool-looking give a certain 'king of the nile feel'.\n Luxeries include Pharaoh Thrones, handwoven curtains, non-alcoholic cocktails and swinging baskets for cats.\n \nTrain: http://www.newscientist.com/data/images/ns/cms/dn3153/dn3153-1_370.jpg\n \n Cat: http://40.media.tumblr.com/tumblr_mb6r5kNLQY1rh8diuo4_1280.jpg";
		description[8]="\nUnleash the power of the Siamese Shinkansen in this all new high-tech train, paired with 114 slinky, cuddly cats.\nTrain: http://rootnotion.co.uk/wp-content/uploads/2014/07/Shinkansen.jpg-2.jpg\nCat: https://upload.wikimedia.org/wikipedia/commons/2/25/Siam_lilacpoint.jpg";
		description[9]="\nUnleash the power of the Siamese Shinkansen in this all new high-tech train, paired with 114 slinky, cuddly cats.\n Luxuries include (but are not limited to): open roof conversion, built in kitty camera, french pastery shop insert, and plush chairs.\n \nTrain: http://rootnotion.co.uk/wp-content/uploads/2014/07/Shinkansen.jpg-2.jpg\n \nCat: https://upload.wikimedia.org/wikipedia/commons/2/25/Siam_lilacpoint.jpg";
		description[10]="\nExpierience the rich history of the steam train while getting a relaxing rest. The Selkirk Rex cats are always ready for a capnap aboard the train.\nThis luxury sleeping car gives you 8 beds with soft and warm blankets, pillows and sheets. The cats (there are 95 in this car)  are sooooo soft, and lucky for you, they love to snuggle.\nTrain Photo: http://www.trainweb.org/oldtimetrains/CLC/cpr2928.jpg\n \nCat: http://www.fantom-xp.com/wallpapers/20/Selkirk_Rex_cat.jpg";
		description[11]="\nMeet the furry culinary geniuses of the cat world: the Devon Rex cats!\nIn this functional dining car, you only get the best: a working brick oven, a large refrigerator for milk, cat food despensers, matching tablecloths and curtains, ice cream maker and chef hats to wear to feel cool and important.\n \nTrain: http://condrenrails.com/IRM/BN-5383-IRM-7-7-07-1.jpg\n \nCat: http://www.catsofaustralia.com/images/leonix-devon-rex.JPG";
		description[12]="\nAlways save the best for last with the Cornish Rex caboose! It fits all trains and styles.\nFeatures 100 Cornish Rex cats, a veiwing rail, and high 'cat'walks so the cats can get to the veiwing window!\n \nCar: http://media-cdn.tripadvisor.com/media/photo-s/01/03/89/ee/caboose-museum-where.jpg\n \nCat: http://d21vu35cjx7sd4.cloudfront.net/dims3/MMAH/crop/0x0%2B0%2B0/resize/645x380/quality/90/?url=http%3A%2F%2Fs3.amazonaws.com%2Fassets.prod.vetstreet.com%2Fef%2F21fcc0a32e11e087a80050568d634f%2Ffile%2FCornish-Rex-4-645mk062211.jpg";



		//Story
		System.out.println("PROLOGUE:\nIn a world where trains replace the common automobile...\nIn a world where cats are voted one of the cuddliest and most 'transportable' pets...\nA train store opens\n \n'Another train store,' the citizens muttered as they passed the new building in their shiny locomotives. 'Just like all the others.'\n \nHowever, the people were wrong.\nThis train store was unlike any other.\nFor within its walls, it sold not only trains, but cats aswell.\nAnd not only did this strange new store sell cats and trains...it sold cats IN trains.\n Cat lovers and train lovers alike would delight in this new, unique store.\n \n But will YOU delight in the coolest and most adorable new store on the planet?\nWhy don't you experience it for yourself?\nType 'ENTER' to enter the store.\n \n(All responses in this virtual shopping expierience should be in CAPITAL LETTERS)\n");
		String enter = scan.next();
		if (enter.equals("ENTER")){


			//Main While Loop (Runs Game)
			boolean catTrain=true;
			while (catTrain==true){

				//boolean purchase=true;
				//while(purchase){


				//Prints List of Cat Train Cars
				System.out.println("\n________________________________________________________________________________________________________________________________________\n  \n");
				System.out.println("*********************************************************************************************************************\n");

				for (int i=0;i<13;i++){


					System.out.println(array[i]+"          (AT A PRICE OF: $"+(price[i])+")");
					System.out.println(" ");
					System.out.println("*********************************************************************************************************************\n");
					//System.out.println(" ");


				}

				System.out.println("\n \n ________________________________________________________________________________________________________________________________________\n");
				System.out.println("You are now entering the store warehouse.\n Please wipe your paws on the way in.");

				System.out.println(" \nShop Owner: Welcome to the Kitty Train Depot! I trust you've heard about our unique packages.\n");
				

				System.out.println("You have $" + bank + " in your bank account to spend.");
				System.out.println("Shop Owner: Which Train Would You like to purchase?\n \n(Indicate the train using its number)");


				//Information
				//					String questionMark = scan.next();
				//					if (questionMark.equals("?")){
				//						System.out.println("Which number train do you want more information of?");
				//						int numbDisc1= scan.nextInt();
				//					System.out.println(description[numbDisc1-1]);
				//					return;

				//}



				int whichTrain = scan.nextInt();
				System.out.println("Are you sure you want to purchase train #" + array[whichTrain-1] +"? ['YES' or 'NO' or '?'-for description]");
				System.out.println("If you bought this train for $" + price[whichTrain-1] + "0, you would have $" +(bank-price[whichTrain-1]) + "0, left over.");
				String sure = scan.next();

				//Purchasing
				if (sure.equals("YES")){

					//Not Enough Money
					if (bank<price[whichTrain-1]){
						System.out.println("Sorry! You don't have enough money left in your bank account to purchase this train!");
						System.out.println("Would you like to\n \nA- Leave the Store?\n \nor\n \nB- Buy more trains?");
						String quitting= scan.next();
						if (quitting.equals("A")){
							boolean helpForkittens= true;
							while (helpForkittens){
								System.out.println("Okay, thanks for shopping with us!\nEnjoy your trains and cats!\n \nWould you like to leave a donation for 'HELP FOR KITTENS'? (YOUR BANK:" + bank +")");
								String donation1 = scan.next();    


								double donation2 =0;

								//Donation
								if (donation1.equals("YES")){
									System.out.println("Please input a deposit into the 'HELP FOR KITTENS' donation box.");
									donation2 =scan.nextDouble();

									if (donation2<bank){
										System.out.println("You don't have enough money to donate that amount.");
										continue;
									}
								}

								else{
									System.out.println("Okay. $"+ donation2 + " will be dontaed to 'HELP FOR KITTENS'\n Thank you for your generosity!");
									bank = bank-donation2;

									System.out.println("\n-------------------------------------------------------------------------\n\nINVENTORY:");
									int i = 0;
									while (i<13 && !(inventory[i].equals(""))){
										i++;
									}

									inventory[i]= "#" + (array[whichTrain-1]);
									for (i=0;i<13;i++){
										System.out.println(inventory[i]);
									}

									System.out.println("Donation- $"+ donation2);
									System.out.println("You have $"+ bank +"0 left in your bank account");
									System.out.println("\n-------------------------------------------------------------------------\n");

									break;
								}
							}
						}
					}
					//Enough Money
					else{
						System.out.println("Great! You have purchased train #"+ array[whichTrain-1]);

						//New Bank Account Amount
						bank = bank-price[whichTrain-1];

						//Printing Inventory After Purchase
						System.out.println("\n-------------------------------------------------------------------------\n\nINVENTORY:");

						int i = 0;
						while (i<13 && !(inventory[i].equals(""))){
							i++;
						}

						inventory[i]= "#" + (array[whichTrain-1]);
						for (i=0;i<13;i++){
							System.out.println(inventory[i]);
						}

						System.out.println("You have $"+ bank +"0 left in your bank account");
						System.out.println("\n-------------------------------------------------------------------------\n");
					}
				}

				else if (sure.equals("?")){
					System.out.println("Which number train do you want more information on?");
					int numbDisc1= scan.nextInt();
					System.out.println("--------------------------------------------------------------------------------------------");
					System.out.println(array[whichTrain-1] + description[numbDisc1-1]);
					System.out.println("--------------------------------------------------------------------------------------------");
					System.out.println("Please Type Any Letter and fross <ENTER> to go back to the shopping expierience.");
					scan.next();
					continue;
				}


				else{ 
					continue;
				}





				//Leave or Buy More Trains
				System.out.println("Would you like to\n \nA- Leave the Store?\n \nor\n \nB- Buy more trains?");
				String quitting= scan.next();
				if (quitting.equals("A")){
					System.out.println("Okay, thanks for shopping with us!\nEnjoy your trains and cats!");
					boolean helpForkittens= true;
					while (helpForkittens){
						System.out.println("Would you like to leave a donation for 'HELP FOR KITTENS'? (YOUR BANK:" + bank +")");
						String donation1 = scan.next();    

						//Donation
						if (donation1.equals("YES")){
							System.out.println("Please input a deposit into the 'HELP FOR KITTENS' donation box.");
							double donation2 =scan.nextDouble();
							if (donation2>bank){
								System.out.println("You don't have enough money to donate that amount.");
								continue;
							}

							else{
								System.out.println("Okay. $"+ donation2 + " will be dontaed to 'HELP FOR KITTENS'\n Thank you for your generosity!");
								bank = bank-donation2;
								
								System.out.println("Here is our favorite inspiring poster, a gift in return for your donation.\nPlease let it inspire you to save the LEGO universe.");
								String scan1 =scan.next();
								Picture.displayCatposter();
								String scan2=scan.next();
								
								System.out.println("\n-------------------------------------------------------------------------\n\nINVENTORY:");


								for (int i=0;i<13;i++){
									System.out.println(inventory[i]);
								}

								System.out.println("Donation- $"+ donation2);
								System.out.println("You have $"+ bank +"0 left in your bank account");
								System.out.println("\n-------------------------------------------------------------------------\n");

								catTrain=false;
								break;

							}

						}
					}
				}
				else{
					continue;
				}

			}
			System.out.println("Thanks again for shopping! Goodbye!");
			catTrain=false;
		}
	}

}





