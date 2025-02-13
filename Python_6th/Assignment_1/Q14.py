import random
from dataclasses import dataclass
from typing import List

@dataclass
class Card:
    suit: str
    rank: str

class Deck:
    suits = ['Hearts', 'Diamonds', 'Clubs', 'Spades']
    ranks = ['2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K', 'A']

    def __init__(self):
        self.cards = [Card(suit, rank) for suit in self.suits for rank in self.ranks]
        self.shuffle()

    def shuffle(self):
        random.shuffle(self.cards)

    def deal(self, num_cards: int) -> List[Card]:
        dealt_cards = self.cards[:num_cards]
        self.cards = self.cards[num_cards:]
        return dealt_cards

def main():
    deck = Deck()
    player_hand = deck.deal(5)
    
    print("Player's hand:")
    for card in player_hand:
        print(f'{card.rank} of {card.suit}')
    
    print(f'\nNumber of remaining cards in the deck: {len(deck.cards)}')

if __name__ == "__main__":
    main()
    
'''
Output---
Player's hand:
J of Hearts
8 of Hearts
Q of Hearts
10 of Hearts
K of Hearts

Number of remaining cards in the deck: 47
'''