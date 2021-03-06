page 50107 BookList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Book;
    CardPageId = BookCard;
    Caption = 'List of Books';


    layout
    {
        area(content)
        {
            repeater(GroupName)
            {

                field(Id; Rec.Id)
                {
                    ApplicationArea = All;
                }

                field(Title; Rec.Title)
                {
                    ApplicationArea = All;
                }

                field(PageCount; Rec.PageCount)
                {
                    ApplicationArea = All;
                    Caption = 'Page Count';
                }

                field(HoursToRead; Rec.HoursToRead)
                {
                    ApplicationArea = All;
                    Caption = 'Hours to Read';
                }

                field(AuthorName; Rec.AuthorName)
                {
                    ApplicationArea = All;
                    Caption = 'Author name';
                }

                field(AuthorId; Rec.AuthorId)
                {
                    ApplicationArea = All;
                    Caption = 'Author Id';
                }

                field(HardCover; Rec.HardCover)
                {
                    ApplicationArea = All;
                    Caption = 'HardCover';
                }

                field(NumOfHardcoverBooks; Rec.NumOfHardcoverBooks)
                {
                    ApplicationArea = All;
                    Caption = 'NumOfHardCoverBooks';
                }

                field(NumberOfBooks; Rec.NumberOfBooks)
                {
                    ApplicationArea = All;
                    Caption = 'NumberOfBooks';
                }

                field(SumOfHoursToRead; Rec.SumOfHoursToRead)
                {
                    ApplicationArea = All;
                    Caption = 'SumOfHoursToRead';
                }
            }
        }

        area(FactBoxes)
        {
            systempart(MyLinks; Links)
            {
                ApplicationArea = All;
            }

            systempart(MyNotes; Notes)
            {
                ApplicationArea = All;
            }
        }
    }

    actions
    {
        area(Navigation)
        {
            action(AuthorList)
            {
                ApplicationArea = All;
                Caption = 'To Author List';
                RunObject = Page AuthorList;
                RunPageMode = View;
            }
        }

        area(Reporting)
        {
            action(CreateReport)
            {
                ApplicationArea = All;
                Caption = 'Create Report';
                RunObject = Page AuthorList;
                Image = Camera;
            }
        }

        area(Processing)
        {
            action(Process)
            {
                ApplicationArea = All;
                Caption = 'Create Report';
                RunObject = Page AuthorList;
            }
        }
    }

    trigger OnOpenPage();
    var
        MyCodeUnit: Codeunit MyTestCodeUnit;
        ReturnValue: Decimal;
    begin
        MyCodeUnit.Run();
        MyCodeUnit.WelcomeUser('Tyler');
        ReturnValue := MyCodeUnit.Addition(5, 6);
        Message(Format(ReturnValue));

    end;
}
