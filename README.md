# some considerations about the code for PPA without the GUI bits for now
1. We need to use one of Aeroplane classes
2. We need to implement the time pause

We only need to consider four integer variables that need to be updated every second, x position, speed of the aeroplane, Y position how far along the runway the aeroplane is, and elevation which is only updated after speed is reached <br />
  these two variables update every second <br />
  after 10 seconds pass <br />
  1. must exceed a certain elevation
  2. must be in centre of the runway

Elevation will only change when the speed is reached <br />
if the plane gains enough elevation before 10 seconds, may take off early <br />
   1. must be in centre of the runway <br />
      if not, chance to correct position of plane before the plane exceeds runway <br />
        
# some variables i think we'll need in our aeroplane class <br />
 int x position <br />
 int speed <br />
 int y position <br />
 int elevation <br />
 boolean isInCentreOfRunway <br />
 boolean hasElevationBeenReached <br />
 something to count if 10 seconds have passed <br />
 something to count if we've reached the end of the runway <br />
 
 
 We can talk about the GUI part of the assignment in person or here if you like

#import java.lang.thread
Public void pause(){
  try{Thread.sleep(1000);} catch{Interrupted Exception e}
}
