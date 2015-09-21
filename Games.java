private final Map <UUID, Integer> playersInGame = new HashMap<>();


private void addToGame(UUID playerID, String gameID)
{
playersInGame.put(playerID, gameID);
}
private void isInGame(UUID playerID)
{
return playersInGame.containsKey(playerID);
}


private void removeFromGame(UUID playerID, String gameID)
{
playersInGame.remove(playerID, gameID);
}

