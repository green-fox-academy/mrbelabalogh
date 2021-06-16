codeunit 50114 CodeUnit1
{
    [EventSubscriber(ObjectType::Table, DataBase::Movie, 'OnAfterInsertEvent', '', true, true)]
    local procedure InsertNewMovie(var Rec: Record Movie)
    var
        Rec2: Record Director;
    begin
        if Rec.DirectorID >= 0 then begin
            Message(Rec.DirectorName, Rec2.TotalMovies);
        end
        else begin
            rec2.FindFirst();
            while rec2.Next()
                Message('Length in minutes: %2', Rec.LengthInMinutes); // Rec.Title.??? Longest movie Title SOLUTION: findfirst() in ALex Movies CODE on github!
        end;
    end;



}