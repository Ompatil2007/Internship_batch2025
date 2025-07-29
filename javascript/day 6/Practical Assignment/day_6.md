Date = 24/07/2025

Topic Covered = Make A Simple Calculator

                1]Events
                2]eventFlow
                3]How to link event to a element


* Events

-Events are actions or occurrences in the browser—like clicks, key presses, etc.—that trigger JavaScript code 

-Commonly used in calculators: click, input, or keydown events on buttons or input fields.


* EventFlow

-Events travel through the DOM in three phases:

-Capture Phase: From the root down to the target element.

-Target Phase: The event reaches the exact element you clicked.

-Bubble Phase (default): From the target back up through parent elements 

-Event Bubbling: After the target is handled, the event bubble propagates up to ancestors—useful for parent-level handling 

-You can stop propagation using event.stopPropagation() or event.stopImmediatePropagation()


* How to link event to a element

-Use addEventListener(eventType, handlerFunction):

example:-
button.addEventListener('click', function(event) {
  // handle click
});