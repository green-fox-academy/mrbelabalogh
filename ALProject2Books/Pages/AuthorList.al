page 50103 AuthorList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Author;
    CardPageId = AuthorCard;

    layout
    {
        area(Content)
        {
            repeater(General)
            {

                field(Id; Rec.Id)
                {
                    ApplicationArea = All;

                }
                field(Name; Rec.Name)
                {
                    ApplicationArea = All;

                }

                field(NumberOfBooksWritten; Rec.NumberOfBooksWritten)
                {
                    ApplicationArea = All;
                }
            }
        }
    }

    actions
    {
        area(Processing)
        {
            action(ActionName)
            {
                ApplicationArea = All;

                trigger OnAction()
                begin

                end;
            }
        }
    }


    trigger OnOpenPage();
    var
        //MyQuery: Query ExampleQuery; // íGy kell egy queryt meghívni
        MyQuery: Query AggregateQuery;

    begin
        if MyQuery.Open() then begin
            while MyQuery.Read() do begin  //Idáig csak végigmentünk az elemein queryvel
                Message(MyQuery.AuthorName); // Az AuthorName alapján szűrtünk rá
            end;
            MyQuery.Close()
        end;
    end;

}
