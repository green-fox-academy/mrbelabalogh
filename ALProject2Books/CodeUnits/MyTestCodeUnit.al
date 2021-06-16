codeunit 50135 MyTestCodeUnit
{
    trigger OnRun();
    var
        Text001: Label 'The OnRun trigger has run';
    begin
        Message(Text001);
    end;


    procedure WelcomeUser(Name: Text)
    var
        Text001: Label 'Hello';

    begin
        Message(Text001, Name);

    end;


    procedure Addition(FirstNumber: Decimal; SecondNumber: Decimal) Result: Decimal
    begin
        Result := FirstNumber + SecondNumber;
    end;
}