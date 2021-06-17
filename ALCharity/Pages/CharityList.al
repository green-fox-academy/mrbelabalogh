page 50115 CharityList
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Charity;

    layout
    {
        area(Content)
        {
            group(GroupName)
            {
                field(Id; Rec.Id)
                {
                    ApplicationArea = All;
                }
                field(DonationId; Rec.DonationId)
                {
                    ApplicationArea = All;
                }
                field(ApplicantId; Rec.ApplicantId)
                {
                    ApplicationArea = All;
                }
            }
        }
    }

    actions
    {
        area(Navigation)
        {
            action(ToDonationList)
            {
                ApplicationArea = All;
                Caption = 'To DonationList';
                RunObject = Page DonatorList;
                RunPageMode = View;
            }
        }
    }

    var
        myInt: Integer;
}