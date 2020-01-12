# Applying Design Patterns to the Fright Machine | Techdegree Project 11

## Project Prompt

We like to have fun with each other here at Treehouse. Recently at our Treehouse office we hacked together a motion detector and several other accessories such as a strobe light and a horn, so that when someone walked by the horn blew a loud noise and the lights flashed. We also hooked up a camera to capture some shots of the look of surprise from the unfortunate person who was unknowingly walking by, which we then shared with the company. We called this device the Fright Machine.

The motion detector and the accessories we used came from a company named Example Enterprises. They hold the sought after domain name, example.com. The camera idea was ours and there isn’t an accessory available from Example Enterprises.

Our idea was pretty popular so we decided to package it up into a reusable little package. We called it Fright Machine.

Well as you can guess, just about everyone wanted one for their home, and of course they wanted to customize it for their particular situation, and make use of different accessories. Problem is our code isn’t extending very well, we currently have hard-coded what happens when the motion is triggered.

Ideally what would happen is that we’d provide a way to attach any accessory to the Fright Machine, and just subscribe to when motion happened. Seems like a design pattern could help right? How about attempting to move that into the Observer pattern for the accessories.

That leaves us with our non accessory products that we’d also like to attach. Hmm maybe there is a design pattern that would allow us to adapt our devices like Cameras to be an accessory. You’ll figure it out, I have faith.

I wrote a unit test and a little sanity script in Main just to see how it’s working. Feel free to adapt the setup script to make sure the test still passes, after applying your patterns.

## Minimum Viable Product:

- Use the Observer design pattern to allow all accessories to be plugged in.
- Use another design pattern to adapt the camera to be an accessory.
- Ensure unit tests pass.
