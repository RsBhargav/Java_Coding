package com.proapti.pkg;


/*
 * 

    There are n people standing in line to buy show tickets.Due to high demand, the venue sells tickets according to the following rules:

        The person at the head of the line can buy exactly one ticket and must then exit the line.
        if a person needs to purchase additional tickets,they must re-enter the end of the line and wait to be sold their next ticket(assume exit and re-entry takes zero seconds).
        Each ticket sale takes exactly one second.

    We express initial line of n people as an array, tickets = [tickets0, tickets1 ... ticketsN-1], 
    where ticketsi denotes the number of tickets person i wishes to buy. If Jesse is standing at a position p in this line, find out how much time it would take for him to buy all tickets. 
    Complete the waiting time function in the editor below. It has two parameters:

        An array, tickets, of n positive integers describing initial sequence of people standing in line. Each ticketsi describes number of tickets that a person waiting at initial place.

        An integer p, denoting Jesse's position in tickets.

        Sample Input 5 2 6 3 4 5 2 Sample Output 12 Sample Input 4 5 5 2 3 3 Sample Output 11
Test Cases:-
tickets{ 2, 6, 3, 4, 5 }, p = 0
simulated t: 6
computed t:  6
tickets{ 2, 6, 3, 4, 5 }, p = 1
simulated t: 20
computed t:  20
tickets{ 2, 6, 3, 4, 5 }, p = 2
simulated t: 12
computed t:  12
tickets{ 2, 6, 3, 4, 5 }, p = 3
simulated t: 16
computed t:  16
tickets{ 2, 6, 3, 4, 5 }, p = 4
simulated t: 19
computed t:  19

 */

public class HackerRank2 
{

	static long waitingTime(int[] tickets, int p) {
        long noOfIterations = 0;
        int ticketBeingProcessed = 0;
        int numberOfParticipantsInLine = tickets.length;
        if(numberOfParticipantsInLine > p)
        {
            while(tickets[p] != 0)
            {
                // The person has already got his ticket and exited the line, just go to the next person, dont increase number of iterations because it took no time
                if(tickets[ticketBeingProcessed] != 0)
                {
                    // ticket being processed got one ticket
                    tickets[ticketBeingProcessed] = tickets[ticketBeingProcessed] -1;
                    // if we have reached the end of the line
                    if(ticketBeingProcessed == numberOfParticipantsInLine -1)
                        ticketBeingProcessed = 0;
                    else
                        ticketBeingProcessed ++;
                    noOfIterations ++;
                }
                else {
                    if (ticketBeingProcessed == numberOfParticipantsInLine - 1)
                        ticketBeingProcessed = 0;
                    else
                        ticketBeingProcessed++;
                }
                
            }
        }
        return noOfIterations;
    }
	public static void main(String[] args) 
	{
		int[] ar={2,6,3,4,5};
		int i=1;
		System.out.println(waitingTime(ar,i));
		
	}

}
