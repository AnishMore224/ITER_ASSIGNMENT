import random

class Card:
    def __init__(self, suit, rank):
        self.suit = suit
        self.rank = rank

    def __str__(self):
        return f"{self.rank} of {self.suit}"

class Deck:
    suits = ['Hearts', 'Diamonds', 'Clubs', 'Spades']
    ranks = ['2', '3', '4', '5', '6', '7', '8', '9', '10', 'Jack', 'Queen', 'King', 'Ace']

    def __init__(self):
        self.cards = [Card(suit, rank) for suit in self.suits for rank in self.ranks]

    def shuffle(self):
        random.shuffle(self.cards)

    def deal(self, num_players, cards_per_player):
        hands = [[] for _ in range(num_players)]
        for i in range(cards_per_player):
            for hand in hands:
                if self.cards:
                    hand.append(self.cards.pop(0))
        return hands

class Player:
    def __init__(self, name):
        self.name = name
        self.hand = []

    def receive_cards(self, cards):
        self.hand.extend(cards)

    def show_hand(self):
        return ', '.join(str(card) for card in self.hand)

def main():
    deck = Deck()
    deck.shuffle()

    num_players = 4
    cards_per_player = 5

    players = [Player(f"Player {i+1}") for i in range(num_players)]
    hands = deck.deal(num_players, cards_per_player)

    for player, hand in zip(players, hands):
        player.receive_cards(hand)
        print(f"{player.name}'s hand: {player.show_hand()}")

if __name__ == "__main__":
    main()
    
'''
Output---
Player 1's hand: King of Diamonds, 7 of Hearts, King of Clubs, 6 of Diamonds, 8 of Hearts
Player 2's hand: 2 of Diamonds, 3 of Clubs, 2 of Spades, Ace of Clubs, 7 of Spades
Player 3's hand: 2 of Clubs, Queen of Clubs, King of Spades, Queen of Hearts, 9 of Clubs
Player 4's hand: 7 of Diamonds, 2 of Hearts, 9 of Hearts, 5 of Hearts, Queen of Diamonds
'''