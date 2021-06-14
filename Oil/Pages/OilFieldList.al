page 50103 OilFieldList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Lists;
    SourceTable = OilFields;
    CardPageId = OilFieldCard;
    Caption = 'List of OilFields';
    Editable = false;

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

                field(SumOfBarrelOil; Rec.SumOfBarrelOil)
                {
                    ApplicationArea = All;
                }

                field(WeeklyOilIncome; Rec.WeeklyOilIncome)
                {
                    ApplicationArea = All;
                    NotBlank = true;
                }

                field(MonthlyExpense; Rec.MonthlyExpense)
                {
                    ApplicationArea = All;
                    NotBlank = true;
                }
                field(Location; Rec.Location)
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
            action("Ledger Entries")
            {
                ApplicationArea = All;
                Caption = 'To OilOrderList';
                RunObject = page OilOrderList;
                trigger OnAction();
                begin

                end;
            }
        }
    }
}