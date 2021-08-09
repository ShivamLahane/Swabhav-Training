import { Component, OnInit } from '@angular/core';
import { IBall } from './IBall';

@Component({
  selector: 'ball-game',
  templateUrl: './game.component.html',
  styleUrls: ['./game.component.css']
})
export class GameComponent implements OnInit 
{
  balls : IBall[] = [];
  blueBallNumber : number;
  ruleContainerDisplay : string;
  gameContainerDisplay : string;
  turns : number;
  msg : string ;

  constructor() 
  { 
    this.blueBallNumber = Math.floor(Math.random() * 50 + 1);
    this.ruleContainerDisplay = "block";
    this.gameContainerDisplay = 'none';
    this.turns = 5;
    this.msg = "";
    console.log(this.blueBallNumber);
  }

  startGame() : void
  {
    this.ruleContainerDisplay = "none";
    this.gameContainerDisplay = 'block';
    for (let i = 1; i < 50; i++)
    {
      this.balls.push({number : i, color : 'grey'});
    }
  }

  changeColorAndAnalyseResult(index : number) : void
  {
    let won : Boolean = false;
    if (index == this.blueBallNumber)
    {
      this.balls[index - 1].color = 'blue';
      won = true;
    }
    else if(index < this.blueBallNumber)
    {
      this.balls[index - 1].color = 'red';
    }
    else if(index > this.blueBallNumber)
    {
      this.balls[index - 1].color = 'green';
    }
    this.turns--;
    if (won || this.turns == 0)
    {
      this.AlertResult(won);
      return;
    }
    this.msg = this.turns + " attempts left";
  }

  AlertResult(won : Boolean) : void
  {
    this.balls = [];
    if(won)
    {
      this.msg = "Congratulations, You won the game";
      return;
    }
    this.msg = "No Attempts Left"
  }

  restartGame() : void
  {
    this.balls = [];
    this.startGame();
  }

  ngOnInit(): void 
  {

  }

}
