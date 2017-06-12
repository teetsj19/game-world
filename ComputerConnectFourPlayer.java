package apcslm;

//Ryan Stabile
//Block D
//May 17, 2017
// Description:

public class ComputerConnectFourPlayer
{
	ConnectFour board = new ConnectFour();
	
	private boolean turn = false;
	private int[][] arr = new int[6][7];
	private int num = 0;
	
	public ComputerConnectFourPlayer()
	{
		
	}
	
	public ComputerConnectFourPlayer(int[][] ar)
	{
		arr = ar;
	}
	
	public void setTurn(boolean turn)
	{
		this.turn = turn;
	}
	
	public boolean getTurn()
	{
		return turn;
	}
	public void scanVertical()
	{
		arr = board.getBoard();
		for(int y = 0; y < 7; y++)
		{
			for(int x = 6; x >= 0; x--)
			{
				if(arr[x][y]==arr[x+1][y] && arr[x+1][y]==arr[x+2][y])
				{
					//move to [x+3][y]
				}
			}
		}
	}
	
	public void scanHorizontal()
	{
		arr = board.getBoard();
		for(int x = 5; x >= 0; x--)
		{
			for(int y = 0; y < 4; y++)
			{
				if(arr[x][y]==arr[x][y+1]&&arr[x][y+1]==arr[x][y+2])
				{
					//move to [x][y+3]
				}
			}
		}
	}
	
	public void scanDiagonal()
	{
		for(int x = 5; x >= 0; x--)
		{
			for(int y = 0; y < 4; y++)
			{
				if(arr[x][y]==arr[x-1][y+1] && arr[x-1][y+1]==arr[x-2][y+2])
				{
					//move to [x-3][y+3]
				}
			}
		}
	}
	
	
	public int generateSpot()
	{
		num = (int) Math.random() * 7;
		return num;
	}
	
	public void randomMove()
	{
		however the hell jason expects this piece of shit to move using the randomly generated num
	}
	
	public void move()
	{
		
	}
	
	
}
