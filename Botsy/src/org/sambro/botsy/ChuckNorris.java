package org.sambro.botsy;

public class ChuckNorris
{
	private static String chuck[] = new String[]
	{
			"Chuck Norris uses ribbed condoms inside out, so he gets the pleasure.",
			"Chuck Norris' tears cure cancer. Too bad he has never cried.",
			"When Chuck Norris has sex with a man, it is not because he is gay, but because he has run out of women.",
			"Macgyver can build an airplane out of gum and paper clips, but Chuck Norris can kill him and take it.",
			"Chuck Norris once roundhouse kicked someone so hard that his foot broke the speed of light, went back in time, and killed Amelia Earhart while she was flying over the Pacific Ocean.",
			"Chuck Norris doesn't read books. He stares them down until he gets the information he wants.",
			"If you ask Chuck Norris what time it is, he always says, \"Two seconds till.\" After you ask, \"Two seconds to what?\" he roundhouse kicks you in the face.",
			"Chuck Norris only masturbates to pictures of Chuck Norris.",
			"Rather than being birthed like a normal child, Chuck Norris instead decided to punch his way out of his mother's womb. Shortly thereafter he grew a beard.",
			"Chuck Norris appeared in the \"Street Fighter II\" video game, but was removed by Beta Testers because every button caused him to do a roundhouse kick. When asked bout this \"glitch,\" Norris replied, \"That's no glitch.\"",
			"Chuck Norris lost his virginity before his dad did.",
			"Since 1940, the year Chuck Norris was born, roundhouse kick related deaths have increased 13,000 percent.",
			"Chuck Norris sold his soul to the devil for his rugged good looks and unparalleled martial arts ability. Shortly after the transaction was finalized, Chuck roundhouse kicked the devil in the face and took his soul back. The devil, who appreciates irony, couldn't stay mad and admitted he should have seen it coming. They now play poker every second Wednesday of the month.",
			"Filming on location for Walker: Texas Ranger, Chuck Norris brought a stillborn baby lamb back to life by giving it a prolonged beard rub. Shortly after the farm animal sprang back to life and a crowd had gathered, Chuck Norris roundhouse kicked the animal, breaking its neck, to remind the crew once more that Chuck giveth, and the good Chuck, he taketh away.",
			"Chuck Norris's girlfriend once asked him how much wood a woodchuck could chuck if a woodchuck could chuck wood. He then shouted, \"HOW DARE YOU RHYME IN THE PRESENCE OF CHUCK NORRIS!\" and ripped out her throat. Holding his girlfriend's bloody throat in his hand he bellowed, \"Don't fuck with Chuck!\" Two years and five months later he realized the irony of this statement and laughed so hard that anyone within a hundred mile radius of the blast went deaf.",
			"Chuck Norris does not sleep. He waits.",
			"Chuck Norris built a time machine and went back in time to stop the JFK assassination. As Oswald shot, Chuck met all three bullets with his beard, deflecting them. JFK's head exploded out of sheer amazement.",
			"Chuck Norris is not hung like a horse... horses are hung like Chuck Norris Chuck Norris was the fourth Wiseman. He brought baby Jesus the gift of \"beard\". Jesus wore it proudly to his dying day. The other Wisemen, jealous of Jesus' obvious gift favoritism, used their combined influence to have Chuck omitted from the Bible. Shortly after all three died of roundhouse kick related deaths.",
			"To prove it isn't that big of a deal to beat cancer. Chuck Norris smoked 15 cartons of cigarettes a day for 2 years and aquired 7 different kinds of cancer only to rid them from his body by flexing for 30 minutes. Beat that, Lance Armstrong.",
			"There are no disabled people. Only people who have met Chuck Norris.",
			"Chuck Norris does not have AIDS but he gives it to people anyway.",
			"There is no chin behind Chuck Norris' beard. There is only another fist.",
			"Chuck Norris once lined up to kick the winning field goal of a high school football game. When the football went flat, he persuaded the referees to let him kick the field goal with a 3 month old child. Chuck roundhoused kicked the baby 60 yards through the uprights and then proceeded to bang every girl in the stadium.",
			"The original theme song to the Transformers was actually \"Chuck Norris--more than meets the eye, Chuck Norris--robot in disguise,\" and starred Chuck Norris as a Texas Ranger who defended the earth from drug-dealing Decepticons and could turn into a pick-up. This was far too much awesome for a single show, however, so it was divided.",
			"The chief export of Chuck Norris is pain.",
			"Chuck Norris is currently suing NBC, claiming Law and Order are trademarked names for his left and right legs.",
			"When Chuck Norris plays Oregon Trail his family does not die from cholera or dysentery, but rather roundhouse kicks to the face. He also requires no wagon, since he carries the oxen, axels, and buffalo meat on his back. He always makes it to Oregon before you.",
			"It was once believed that Chuck Norris actually lost a fight to a pirate, but that is a lie, created by Chuck Norris himself to lure more pirates to him. Pirates never were very smart.",
			"Chuck Norris recently had the idea to sell his urine as a canned beverage. We know this beverage as Red Bull.",
			"Chuck Norris used live ammunition during all shoot-outs. When a director once said he couldn't, he replied, \"Of course I can, I'm Chuck Norris,\" and roundhouse kicked him in the face.",
			"If paper beats rock, rock beats scissors, and scissors beats paper, what beats all 3 at the same time? Answer: Chuck Norris.",
			"If you can see Chuck Norris, he can see you. If you can't see Chuck Norris, you may be only seconds away from death.",
			"On the 7th day, God rested.... Chuck Norris took over.",
			"When his martial arts prowess fails to resolve a situation, Chuck Norris plays dead. When playing dead doesn't work, he plays zombie.",
			"Although it is not common knowledge, there are actually three sides to the Force: the light side, the dark side, and Chuck Norris.",
			"Scientists used to believe that diamond was the world's hardest substance. But then they met Chuck Norris, who gave them a roundhouse kick to the face so hard, and with so much heat and pressure, that the scientists turned into artificial Chuck Norris.",
			"God offered Chuck Norris the gift to fly, which he swiftly declined for super strength roundhouse ability.",
			"When Chuck Norris was denied a Bacon McMuffin at McDonalds because it was 10:35, he roundhouse kicked the store so hard it became a KFC.",
			"Chuck Norris drinks napalm to quell his heartburn.",
			"A duck's quack does not echo. Chuck Norris is solely responsible for this phenomenon. When asked why he will simply stare at you, grimly.",
			"Chuck Norris once tried to defeat Garry Kasparov in a game of chess. When Norris lost, he won in life by roundhouse kicking Kasparov in the side of the face.",
			"Chuck Norris' roundhouse kick is so powerful, it can be seen from outer space by the naked eye.",
			"Chuck Norris doesn't believe in Germany.",
			"If you want a list of Chuck Norris' enemies, just check the extinct species list.",
			"Chuck Norris has never blinked in his entire life. Never.",
			"When Chuck Norris' wife burned the turkey one thanksgiving, Chuck said, \"don't worry about it honey,\" and went into his backyard. He came back five minutes later with a live turkey, ate it whole, and when he threw it up a few seconds later it was fully cooked and came with cranberry sauce. When his wife asked him how he had done it, he gave her a roundhouse kick to the face and said, \"Never question Chuck Norris.\"",
			"Chuck Norris once shot an enemy plane down with his finger, by yelling, \"Bang!\"",
			"Chuck Norris doesn't need to swallow when eating food.",
			"If Superman and The Flash were to race to the edge of space you know who would win? Chuck Norris.",
			"Ironically, Chuck Norris' hidden talent is invisibility.",
			"Chuck Norris eats transformer toys in vehicle mode and poos them out transformed into a robot.",
			"Chuck Norris owns the greatest poker face of all-time. It helped him win the 1983 world series of poker despite him holding just a joker, a 2 of clubs, a 7 of spades, and a green number 4 from Uno and a monopoly 'get out of jail free' card.",
			"Chuck Norris invented a language that incorporates karate and roundhouse kicks. So next time Chuck Norris is kicking your ass, don't be offended or hurt, he may be just trying to tell you he likes your hat.",
			"Chuck Norris invented water.",
			"Chuck Norris went looking for a bar but couldn't find one. He walked to a vacant lot and sat there. Sure enough within an hour an a half someone constructed a bar around him. He then ordered a shot, drank it, and then burned the place to the ground. Chuck Norris yelled over the roar of the flames, \"always leave things the way you found em!\"",
			"One time while sparring with Wolverine, Chuck Norris accidentally lost his left testicle. You might be familiar with it to this very day by its technical term: Jupiter.",
			"Contrary to popular belief, Chuck Norris, not the box jellyfish of northern Australia, is the most venomous creature on earth. Within 3 minutes of being bitten, a human being experiences the following symptoms: fever, blurred vision, beard rash, tightness of the jeans, and the feeling of being repeatedly kicked through a car windshield.",
			"Chuck Norris is Luke Skywalker's real father.",
			"Chuck Norris does not use spell check. If he happens to misspell a word, Oxford will simply change the actual spelling of it.",
			"Before science was invented it was once believed that autumn occurred when Chuck Norris roundhouse kicked every tree in existence.",
			"In the original pilot for Star Trek Next Generation, Chuck Norris can be seen powering the USS Enterprise warp drive with his roundhouse kicks.",
			"Chuck Norris' calendar goes straight from March 31st to April 2nd; no one fools Chuck Norris.",
			"Chuck Norris once won a game of Connect Four in 3 moves.",
			"Leading hand sanitizers claim they can kill 99.9 percent of germs. Chuck Norris can kill 100 percent of whatever he wants.",
			"Some kids piss their name in the snow. Chuck Norris can piss his name into concrete.",
			"Chuck Norris once visited the Virgin Islands. They are now The Islands.",
			"Chuck Norris' tears cure cancer. Too bad he has never cried.",
			"Chuck Norris was originally cast as the main character in 24, but was replaced by the producers when he managed to kill every terrorist and save the day in 12 minutes and 37 seconds.",
			"Chuck Norris counted to infinity - twice.",
			"Chuck Norris can speak braille.",
			"Once, while having sex in a tractor-trailer, part of Chuck Norris' sperm escaped and got into the engine. We now know this truck as Optimus Prime.",
			"Chuck Norris puts the \"laughter\" in \"manslaughter\".",
			"If you spell Chuck Norris wrong on Google it doesn't say, \"Did you mean Chuck Norris?\" It simply replies, \"Run while you still have the chance.\"",
			"Chuck Norris can do a wheelie on a unicycle.",
			"On a high school math test, Chuck Norris put down \"Violence\" as every one of the answers. He got an A+ on the test because Chuck Norris solves all his problems with Violence.",
			"Chuck Norris died ten years ago, but the Grim Reaper can't get up the courage to tell him.",
			"Superman owns a pair of Chuck Norris pajamas.",
			"Chuck Norris does not hunt because the word hunting implies the possibility of failure. Chuck Norris goes killing.",
			"When the Boogeyman goes to sleep every night he checks his closet for Chuck Norris.",
			"Once a cobra bit Chuck Norris' leg. After five days of excruciating pain, the cobra died.",
			"Chuck Norris can slam revolving doors.",
			"Giraffes were created when Chuck Norris uppercutted a horse.",
			"Chuck Norris can delete the Recycling Bin.",
			"If you play Led Zeppelin's \"Stairway to Heaven\" backwards, you will hear Chuck Norris banging your sister.",
			"If it looks like chicken, tastes like chicken, and feels like chicken but Chuck Norris says its beef, then it's fucking beef.",
			"Chuck Norris never played with rubber ducks in the bathtub. His 3 favorite bath toys consisted of a radio, a toaster, and a middle aged Vietnamese man.",
			"Chuck Norris sleeps with a night light. Not because Chuck Norris is afraid of the dark, but the dark is afraid of Chuck Norris",
			"When Chuck Norris gives you the finger, he's telling you how many seconds you have left to live.",
			"Chuck Norris doesn't pop his collar, his shirts just get erections when they touch his body.",
			"Chuck Norris secretly sleeps with every woman in the world once a month. They bleed for a week as a result.",
			"Chuck Norris can kill two stones with one bird.",
			"Chuck Norris doesn't have hair on his testicles, because hair does not grow on steel.",
			"Chuck Norris was once on Celebrity Wheel of Fortune and was the first to spin. The next 29 minutes of the show consisted of everyone standing around awkwardly, waiting for the wheel to stop.",
			"The best part of waking up is not Folgers in your cup, but knowing that Chuck Norris didn't kill you in your sleep.",
			"Bill Gates lives in constant fear that Chuck Norris' PC will crash.",
			"Chuck Norris is not hung like a horse... horses are hung like Chuck Norris",
			"Chuck Norris is the only person on the planet that can kick you in the back of the face.",
			"Chuck Norris has to maintain a concealed weapon license in all 50 states in order to legally wear pants.",
			"Ghosts are actually caused by Chuck Norris killing people faster than Death can process them.",
			"Chuck Norris can strangle you with a cordless phone.",
			"Chuck Norris doesn't need a miracle in order to split the ocean. He just walks in and the water gets the fuck out of the way.",
			"Mr. T once defeated Chuck Norris in a game of Tic-Tac-Toe. In retaliation, Chuck Norris invented racism.",
			"Chuck Norris never retreats, he just attacks in the opposite direction.",
			"Chuck Norris likes to knit sweaters in his free time. And by \"knit\", I mean \"kick\", and by \"sweaters\", I mean \"babies\".",
			"Chuck Norris is 1/8th Cherokee. This has nothing to do with ancestry, the man ate a fucking Jeep.",
			"Chuck Norris plays russian roulette with a fully loaded revolver... and wins.",
			"Chuck Norris can build a snowman out of rain.",
			"It is considered a great accomplishment to go down Niagara Falls in a wooden barrel. Chuck Norris can go up Niagara Falls in a cardboard box.",
			"A rogue squirrel once challenged Chuck Norris to a nut hunt around the park. Before beginning, Chuck simply dropped his pants, instantly killing the squirrel and 3 small children. Chuck knows you can't find bigger, better nuts than that.",
			"Chuck Norris was once charged with three attempted murdered in Boulder County, but the Judge quickly dropped the charges because Chuck Norris does not \"attempt\" murder.",
			"Chuck Norris once punched a man in the soul.",
			"The reason newborn babies cry is because they know they have just entered a world with Chuck Norris.",
			"When Chuck Norris looks in a mirror the mirror shatters, because not even glass is stupid enough to get in between Chuck Norris and Chuck Norris.",
			"When Chuck Norris enters a room, he doesn't turn the lights on, he turns the dark off.",
			"Chuck Norris once had a heart attack; his heart lost.",
			"Death once had a near-Chuck-Norris experience.",
			"Brett Favre can throw a football over 50 yards. Chuck Norris can throw Brett Favre even further.",
			"Rosa Parks refused to get out of her seat because she was saving it for Chuck Norris.",
			"Chuck Norris can drown a fish.",
			"Chuck Norris doesn't use pickup lines, he simply says, \"Now.\"",
			"Chuck Norris can make a paraplegic run for his life.",
			"M.C. Hammer learned the hard way that Chuck Norris can touch this.",
			"Chuck Norris once bowled a 300. Without a ball. He wasn't even in a bowling alley.",
			"Jack was nimble, Jack was quick, but Jack still couldn't dodge Chuck Norris' roundhouse kick.",
			"Chuck Norris is currently in a legal battle with the makers of Bubble Tape. Norris claims \"6 Feet of Fun\" is actually the trademark for his penis.",
			"Chuck Norris can tie his shoes with his feet.",
			"Chuck Norris was originally offered the role as Frodo in Lord of the Rings. He declined because, \"Only a pussy would need three movies to destroy a piece of jewelery.\"",
			"A Handicap parking sign does not signify that this spot is for handicapped people. It is actually in fact a warning, that the spot belongs to Chuck Norris and that you will be handicapped if you park there.",
			"The only time Chuck Norris was wrong was when he thought he had made a mistake.",
			"Chuck Norris once had an erection while lying face down and struck oil.",
			"Pinatas were made in an attempt to get Chuck Norris to stop kicking the people of Mexico. Sadly this backfired, as all it has resulted in is Chuck Norris now looking for candy after he kicks his victims.",
			"Chuck Norris does not know where you live, but he knows where you will die.",
			"When God said, \"Let there be light\", Chuck Norris said, \"say please.\"",
			"Someone once tried to tell Chuck Norris that roundhouse kicks aren't the best way to kick someone. This has been recorded by historians as the worst mistake anyone has ever made.",
			"Chuck Norris keeps his ID on the bottom of his right foot. Nobody ever asks him for his ID.",
			"Chuck Norris doesn't play \"hide-and-seek.\" He plays \"hide-and-pray-I-don't-find-you.",
			"The quickest way to a man's heart is with Chuck Norris's fist.",
			"The last digit of pi is Chuck Norris. He is the end of all things.",
			"Upon hearing that his good friend, Lance Armstrong, lost his testicles to cancer, Chuck Norris donated one of his to Lance. With just one of Chuck's nuts, Lance was able to win the Tour De France seven times. By the way, Chuck still has two testicles; either he was able to produce a new one simply by flexing, or he had three to begin with. No one knows for sure.",
			"Before Chuck Norris was born, the martial arts weapons with two pieces of wood connected by a chain were called NunBarrys. No one ever did find out what happened to Barry.",
			"Chuck Norris once finished \"The Song that Never Ends\".",
			"The saddest moment for a child is not when he learns Santa Claus isn't real, it's when he learns Chuck Norris is.",
			"Chuck Norris is the only person that can punch a cyclops between the eye.",
			"Most men are okay with their wives fantasizing about Chuck Norris during sex, because they are doing the same thing.",
			"Chuck Norris used to beat the shit out of his shadow because it was following to close. It now stands a safe 30 feet behind him.",
			"Chuck Norris cannot predict the future; the future just better fucking do what Chuck Norris says.",
			"We all know the magic word is please. As in the sentence, \"Please don't kill me.\" Too bad Chuck Norris doesn't believe in magic.",
			"The only reason Chuck Norris didn't win an Oscar for his performance in \"Sidekicks\" is because nobody in their right mind would willingly give Chuck Norris a blunt metal object. That's just suicide.",
			"Bullets dodge Chuck Norris.",
			"Chuck Norris has two speeds: Walk, and Kill",

	};

	public static int getChuckCount()
	{
		return chuck.length;
	}

	public static String getChuck()
	{
		int highValue = chuck.length - 1;
		int lowValue = 0;

		int index = (int) ((highValue - lowValue + 1) * Math.random() + lowValue);
		return chuck[index];
	}

	public static String getChuckNumber(int index)
	{
		if (index >= chuck.length)
			return null;
		return chuck[index];
	}
}
