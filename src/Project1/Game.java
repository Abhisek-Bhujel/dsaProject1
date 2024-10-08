//package Project1;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//import java.util.Random;
//
//public final class Game extends JPanel
//{
//    private static Board board;
//    private static Block block;
//    private static Random rand = new Random();
//    private final static Color[] color = {
//            Color.black, Color.red, Color.green, Color.blue, Color.cyan, Color.magenta, Color.orange, Color.yellow, Color.pink, Color.white
//    };
//
//    @Override
//    public void paintComponent(Graphics g)
//    {
//        drawBoard(g);
//        drawBlock(g);
//    }
//
//    private void drawBoard(Graphics g)
//    {
//        for (int y=0; y<board.getHeight(); y++)
//        {
//            for (int x=0; x<board.getWidth(); x++)
//            {
//                Tile tile = board.getTile(y,x);
//                int colorIndex = tile == null ? 0 : tile.getColor();
//                g.setColor(color[colorIndex]);
//                g.fillRect(20*x, 20*y, 20, 20);
//            }
//        }
//    }
//
//    private void drawBlock(Graphics g)
//    {
//        for (int y=0; y<block.getSize(); y++)
//            for (int x=0; x<block.getSize(); x++)
//            {
//                Tile tile = block.getTile(y,x);
//                if (tile != null)
//                {
//                    g.setColor(color[tile.getColor()]);
//                    g.fillRect(20*(x+block.getX()), 20*(y+block.getY()), 20, 20);
//                }
//            }
//    }
//
//    public static void main(String[] args)
//    {
//        if (args.length != 2)
//        {
//            System.err.println("Usage: java Game <height> <width>");
//            return;
//        }
//
//        JFrame window = new JFrame("CS310 - Spring 2024 - Project 1");
//        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        board = new Board(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
//        block = new Block(0, 3, 3, (byte)(1 + rand.nextInt(color.length-1)));
//        window.setSize(board.getWidth()*20, board.getHeight()*20+29);
//        window.setVisible(true);
//        final Game tetris = new Game();
//        window.add(tetris);
//
//        window.addKeyListener(new KeyListener()
//        {
//            public void keyPressed(KeyEvent e)
//            {
//                switch (e.getKeyCode()) {
//                    case KeyEvent.VK_LEFT:
//                        if (Tetris.canMoveLeft(board, block))
//                            block.moveLeft();
//                        break;
//                    case KeyEvent.VK_RIGHT:
//                        if (Tetris.canMoveRight(board, block))
//                            block.moveRight();
//                        break;
//                    case KeyEvent.VK_UP:
//                        if (Tetris.canflipVertical(board, block))
//                            block.flipVertical();
//                        break;
//                    case KeyEvent.VK_DOWN:
//                        if (Tetris.canflipHorizontal(board, block))
//                            block.flipHorizontal();
//                        break;
//                    case KeyEvent.VK_R:
//                        if (Tetris.canRotate(board, block))
//                            block.rotate();
//                        break;
//                    case KeyEvent.VK_OPEN_BRACKET:
//                        if (Tetris.canScaleDown(board, block))
//                        {
//                            block = block.scaleDown();
//                            board.penalize();
//                        }
//                        break;
//                    case KeyEvent.VK_CLOSE_BRACKET:
//                        if (Tetris.canScaleUp(board, block))
//                        {
//                            block = block.scaleUp();
//                            board.reward();
//                        }
//                        break;
//                    case KeyEvent.VK_PAGE_DOWN:
//                        if (Tetris.canDrop(board, block))
//                            block.drop();
//                        break;
//                }
//
//                tetris.repaint();
//            }
//
//            public void keyReleased(KeyEvent e) { /* do nothing */ }
//
//            public void keyTyped(KeyEvent e) { /* do nothing */ }
//
//        });
//
//        new Thread()
//        {
//            @Override
//            public void run()
//            {
//                while (true) {
//                    try
//                    {
//                        Thread.sleep(1000);
//
//                        if (Tetris.canDrop(board, block))
//                            block.drop();
//                        else
//                        {
//                            board.consolidate(block);
//                            board.clearRows();
//                            block = new Block(0, 3, 3, (byte)(1 + rand.nextInt(color.length-1)));
//                        }
//
//                        tetris.repaint();
//
//                        if (Tetris.isGameOver(board, block))
//                            break;
//                    }
//                    catch(InterruptedException e )
//                    {
//                    }
//                }
//            }
//        }.start();
//    }
//}
