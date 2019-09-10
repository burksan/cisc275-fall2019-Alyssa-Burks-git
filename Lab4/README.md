# cisc275-fall2019-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?

> One Array List
> 3 Dogs
> One Comparator

3. Can you spot the Comparator constructor call? Where is the class definition for the Comparator?

>Constructor Call: Collections.sort(dogs, new Comparator<Animal>()
> Class Definition: public int compare(Animal a, Animal b){
			    	return a.getLegs() - b.getLegs();