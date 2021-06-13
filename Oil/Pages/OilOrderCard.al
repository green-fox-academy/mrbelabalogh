page 50108 OilOrderCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = OilOrder;
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

                field(OrderedBarrels; Rec.OrderedBarrels)
                {
                    ApplicationArea = All;
                }

                field(BarrelPrice; Rec.BarrelPrice)
                {
                    ApplicationArea = All;
                }
                field(OrderStartDate; Rec.OrderStartDate)
                {
                    ApplicationArea = All;
                }

                field(IsAccepted; Rec.IsAccepted)
                {
                    ApplicationArea = All;
                }
            }
        }
    }
}