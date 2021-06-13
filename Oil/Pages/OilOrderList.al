page 50107 OilOrderList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = OilOrder;
    CardPageId = OilOrderCard;
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

                field(OrderedBarrel; Rec.OrderedBarrels)
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