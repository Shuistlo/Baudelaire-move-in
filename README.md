# some considerations about the code for PPA without the GUI bits for now
1. We need to use one of Aeroplane classes
2. We need to implement the time pause

We only need to consider four integer variables that need to be updated every second, x position, speed of the aeroplane, Y position how far along the runway the aeroplane is, and elevation which is only updated after speed is reached
  these two variables update every second
  after 10 seconds pass
    1. must exceed a certain elevation
    2. must be in centre of the runway
Elevation will only change when the speed is reached 
  if the plane gains enough elevation before 10 seconds, may take off early
    1. must be in centre of the runway
        if not, chance to correct position of plane before the plane exceeds runway
        
 # some variables i think we'll need in our aeroplane class
 int x position
 int speed
 int y position
 int elevation
 boolean isInCentreOfRunway
 boolean hasElevationBeenReached
 something to count if 10 seconds have passed
 something to count if we've reached the end of the runway
 
 
 We can talk about the GUI part of the assignment in person or here if you like
