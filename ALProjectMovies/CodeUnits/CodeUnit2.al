codeunit 50115 CodeUnit2
{
    [EventSubscriber(ObjectType::Table, DataBase::BoxOffice, 'OnAfterInsertEvent', '', true, true)]
    local procedure InsertNewBoxOffice(var Rec: Record BoxOffice)
    var
        Rec2: Record Movie;
    //.findfirst .next while loop? if?
    begin
        rec2.FindFirst();
        while rec2.Next();

        Message('%1, %2,', Rec2.Title, Rec2.DirectorName) // top 10 movie ranked by Domestic and International Sales?? SOLUTION: with Query!

    end;




    trigger OnRun()
    begin

    end;

    var
        myInt: Integer;
}