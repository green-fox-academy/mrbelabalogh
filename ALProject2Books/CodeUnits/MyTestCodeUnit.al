codeunit 50135 MyTestCodeUnit
{
    trigger OnRun()
    begin
        Message('The OnRun trigger has run');
    end;


    procedure WelcomeUser(Name: Text)

    begin
        Message('Hello %1', Name);

    end;


    procedure Addition(FirstNumber: Decimal; SecondNumber: Decimal) Result: Decimal
    begin
        Result := FirstNumber + SecondNumber;
    end;
}