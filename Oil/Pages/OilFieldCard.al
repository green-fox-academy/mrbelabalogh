page 50104 OilFieldCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = OilFields;
    AutoSplitKey = true;
    DelayedInsert = true;

    layout
    {
        area(Content)
        {
            group(General)
            {
                field(Id; Rec.Id)
                {
                    ApplicationArea = All;
                    ShowMandatory = true;
                }

                field(SumOfBarrelOil; Rec.SumOfBarrelOil)
                {
                    ApplicationArea = All;
                }

                field(WeeklyOilIncome; Rec.WeeklyOilIncome)
                {
                    ApplicationArea = All;
                }
                field(MonthlyExpense; Rec.MonthlyExpense)
                {
                    ApplicationArea = All;
                }

                field(Location; Rec.Location)
                {
                    ApplicationArea = All;
                }
            }
        }
    }
}